package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Question<T> {
    String text;
    String difficultyLevel;
    List<String> options;
    T correctAnswer;

    public Question(String text, String difficultyLevel, List<String> options, T correctAnswer) {
        this.text = text;
        this.difficultyLevel = difficultyLevel;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(T studentAnswer) {
        return correctAnswer.equals(studentAnswer);
    }

    @Override
    public String toString() {
        return "Question: " + text + " (Difficulty: " + difficultyLevel + "), Options: " + options;
    }
}

class Subject {
    String name;
    List<Question<?>> questions = new ArrayList<>();

    Subject(String name) {
        this.name = name;
    }

    public void addQuestion(Question<?> question) {
        questions.add(question);
    }

    public void displayQuestions() {
        System.out.println("Questions for " + name + " -");
        for (Question<?> q : questions) {
            System.out.println(q);
        }
        System.out.println();
    }

}

class Answer<T> {
    Question<T> question;
    T submittedAnswer;

    public Answer(Question<T> question, T submittedAnswer) {
        this.question = question;
        this.submittedAnswer = submittedAnswer;
    }
}


class Student {
    String name;
    String rollNumber;
    Map<Subject, List<Answer<?>>> examAnswers = new HashMap<>();

    Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void takeExam(Subject subject, List<Answer<?>> answers) {
        examAnswers.put(subject, answers);
        System.out.println("\n" + this.name + " has submitted answers for the " + subject.name + " exam.");
    }

    public void display() {
        System.out.println("Student Name: " + this.name + ", Roll Number: " + this.rollNumber);
    }
}

class Exam {

    public static int calculateScore(Student student, Subject subject) {
        List<Answer<?>> answers = student.examAnswers.get(subject);

        int score = 0;
        for (Answer<?> answer : answers) {
            if (isAnswerCorrect(answer)) {
                score++;
            }
        }
        return score;
    }

    private static <T> boolean isAnswerCorrect(Answer<T> answer) {
        return answer.question.isCorrect(answer.submittedAnswer);
    }
}


public class OnlineExamSystem {
    public static void main(String[] args) {
        Subject java = new Subject("Java");

        List<String> javaQ1Options = Arrays.asList("option a", "option b", "option c", "option d");
        Question<Integer> javaQ1 = new Question<>("this is ques 1", "Easy", javaQ1Options, 0);

        List<String> javaQ2Options = Arrays.asList("option a", "option b", "option c", "option d");
        Question<Integer> javaQ2 = new Question<>("this is ques 2", "Medium", javaQ2Options, 0);

        Question<Integer> javaQ3 = new Question<>("fill in the blank", "Easy", null, 4);

        java.addQuestion(javaQ1);
        java.addQuestion(javaQ2);
        java.addQuestion(javaQ3);
        java.displayQuestions();
        
        Student student1 = new Student("Govind", "1234");
        student1.display();

        List<Answer<?>> GovindAnswers = new ArrayList<>();
        GovindAnswers.add(new Answer<>(javaQ1, 0)); 
        GovindAnswers.add(new Answer<>(javaQ2, 1)); 
        GovindAnswers.add(new Answer<>(javaQ3, 4));

        student1.takeExam(java, GovindAnswers);
        
        int score = Exam.calculateScore(student1, java);
        System.out.println("\nCalculating score for " + student1.name + ": ");
        System.out.println("Final Score: " + score + " out of " + java.questions.size());
    }
}