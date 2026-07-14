package com.example.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myportfolio {

    @GetMapping("/myself")
    public String myself() {
        return """
                <h2>My Portfolio</h2>
                <p><b>Name:</b> Mayank Sagar</p>
                <p><b>Course:</b> B.Tech Computer Science Engineering</p>
                <p><b>Year:</b> Final Year</p>
                <p><b>Skills:</b> Java, Spring Boot, SQL, JavaScript, C++, Git</p>
                <p><b>Career Goal:</b> Become a Full Stack Java Developer</p>
                """;
    }

    @GetMapping("/education")
    public String education() {
        return """
                <h2>Education</h2>
                <ul>
                    <li><b>B.Tech (CSE)</b> - Currently Pursuing</li>
                    <li><b>12th</b> - Completed</li>
                    <li><b>10th</b> - Completed</li>
                </ul>
                """;
    }

    @GetMapping("/projects")
    public String projects() {
        return """
                <h2>Projects</h2>
                <ol>
                    <li>Hospital Payment Gateway</li>
                    <li>AI Stock Research Agent</li>
                    <li>Healthcare Appointment Scheduling Portal</li>
                    <li>Dance Studio Website</li>
                </ol>
                """;
    }
}