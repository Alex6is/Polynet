//package com.polytech.Rest;
//
//import com.polytech.Business.PublicationService;
//import com.polytech.data.InMemoryRepository;
//import com.polytech.data.Story;
//import com.polytech.data.StoryRepository;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@WebServlet("/")
//@RestController
//public class StoryServlet extends HttpServlet {
//    PublicationService publicationService;
//    public StoryServlet() {
//        StoryRepository storyRepository = new InMemoryRepository();
//         publicationService = new PublicationService(storyRepository);
//        StoryController storyController = new StoryController(publicationService);
//    }
//
//    @Override
//    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String content = req.getParameter("content");
//        publicationService.share(new Story(content));
//        resp.setStatus(201);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Story> feed = publicationService.fetchAll();
//
//        resp.setContentType("application/json");
//        String body = feed.stream().map(story->story.toString()).collect(Collectors.joining(","));
//        PrintWriter writer = resp.getWriter();
//        writer.println("[" + body +"]");
//    }
//}
