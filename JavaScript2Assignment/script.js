
document.addEventListener("DOMContentLoaded", () => {
    const startButton = document.querySelector(".btn-primary");
    const questionContainer = document.querySelector(".card-body");
    const timerElement = document.querySelector(".badge.text-bg-primary");
    const scoreElement = document.querySelector("h2");
    const playAgainButton = document.querySelectorAll(".btn-primary")[1];
    const categorySelect = document.querySelectorAll(".form-select")[0]; // First dropdown (Category)
    const difficultySelect = document.querySelectorAll(".form-select")[1];
    let questions = [];
    let currentQuestionIndex = 0;
    let score = 0;
    let timer;
    let timeLeft = 15;

    // Fetch Questions from API for gk Questions;
    async function fetchQuestions() {

        const category =categorySelect.value// Get selected category;
        const difficulty =difficultySelect.value; //get select difficulty level;
        console.log(category)
        console.log(difficulty)
        let API_URL='';
        if(difficulty==='easy'){
         API_URL = `https://opentdb.com/api.php?amount=10&category=${category}&difficulty=${difficulty}&type=multiple`;
        }
        if(difficulty==='medium'){
            API_URL = `https://opentdb.com/api.php?amount=15&category=${category}&difficulty=${difficulty}&type=multiple`;
        }
        if(difficulty==='hard'){
            API_URL = `https://opentdb.com/api.php?amount=20&category=${category}&difficulty=${difficulty}&type=multiple`;
        }

        startButton.disabled = true; // This to prevent spam clicking
        setTimeout(() => startButton.disabled = false, 3000); // To renable afer 3 sec;

        try {
            const response = await fetch(API_URL);

            if (response.status === 429) {
                throw new Error("Too many requests! Please wait and try again.");
            }

            const data = await response.json();

            if (!data.results || data.results.length === 0) {
                throw new Error("No questions found. Try again later.");
            }

            questions = data.results;
            currentQuestionIndex = 0;
            score = 0;
            console.log(questions);
            updateScore(); // Reset the score on new quiz
            showQuestion();
        } catch (error) {
            console.error("Error fetching questions:", error);
            questionContainer.innerHTML = `<h5 class="text-danger">Error: ${error.message}</h5>`;
        }
    }

    // Update Score Display
    function updateScore() {
        scoreElement.innerHTML = `Your Score: <span class="badge bg-success">${score} / ${questions.length}</span>`;
    }

    // Start Timer
    function startTimer() {
        timeLeft = 15;
        timerElement.textContent = timeLeft;

        clearInterval(timer);
        timer = setInterval(() => {
            timeLeft--;
            timerElement.textContent = timeLeft;
            if (timeLeft <= 0) {
                clearInterval(timer);
                showCorrectAnswer(); // This is to Show correct answer if time runs out
                setTimeout(() => {
                    currentQuestionIndex++;
                    showQuestion();
                }, 1000);
            }
        }, 1000);
    }

    // Display a Question
    function showQuestion() {
        if (currentQuestionIndex >= questions.length) {
            return endQuiz();
        }

        const questionData = questions[currentQuestionIndex];
        const questionText = questionData.question;
        const correctAnswer = questionData.correct_answer;
        const options = [...questionData.incorrect_answers, correctAnswer].sort(() => Math.random() - 0.5);

        questionContainer.innerHTML = `
            <h5 class="card-title">Question ${currentQuestionIndex + 1}</h5>
            <p class="card-text">${questionText}</p>
            <div class="d-flex flex-wrap gap-5 justify-content-center">
                ${options.map(option => `<button class="btn btn-outline-success btn-sm">${option}</button>`).join('')}
            </div>
        `;

        document.querySelectorAll(".btn-outline-success").forEach(button => {
            button.addEventListener("click", (event) => checkAnswer(event, correctAnswer));
        });

        startTimer();
    }

    // Check Answer and Show Correct Answer if Wrong
    function checkAnswer(event, correctAnswer) {
        clearInterval(timer); // Stop timer when an answer is selected
        const selectedOption = event.target;
        const allButtons = document.querySelectorAll(".btn-outline-success");

        if (selectedOption.textContent === correctAnswer) {
            score++;
            updateScore();
            selectedOption.classList.remove("btn-outline-success");
            selectedOption.classList.add("btn-success"); // Highlight correct answer in green
        } else {
            selectedOption.classList.remove("btn-outline-success");
            selectedOption.classList.add("btn-danger"); // Highlight wrong answer in red

            // Highlight the correct answer
            allButtons.forEach(button => {
                if (button.textContent === correctAnswer) {
                    button.classList.remove("btn-outline-success");
                    button.classList.add("btn-success"); // Correct answer in green
                }
            });
        }

        setTimeout(() => {
            currentQuestionIndex++;
            showQuestion();
        }, 1000);
    }

    // Show Correct Answer when Time Runs Out
    function showCorrectAnswer() {
        const correctAnswer = questions[currentQuestionIndex].correct_answer;
        const allButtons = document.querySelectorAll(".btn-outline-success");

        allButtons.forEach(button => {
            if (button.textContent === correctAnswer) {
                button.classList.remove("btn-outline-success");
                button.classList.add("btn-success"); // Highlight correct answer
            }
        });
    }

    // End Quiz
    function endQuiz() {
        questionContainer.innerHTML = `<h5 class="card-title">Quiz Completed!</h5>`;
        updateScore();
        playAgainButton.style.display = "block";
    }

    // Event Listeners
    startButton.addEventListener("click", fetchQuestions);
    playAgainButton.addEventListener("click", () => {
        questionContainer.innerHTML = "";
        score = 0;
        updateScore();
        fetchQuestions();
    });

    // Hide Play Again button initially
    playAgainButton.style.display = "none";
});



