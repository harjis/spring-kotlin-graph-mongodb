package com.example.springkotlingraphmongodb.db

import com.example.springkotlingraphmongodb.app.entities.Graph
import com.example.springkotlingraphmongodb.app.repositories.GraphRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Seeds {
    @Bean
    fun initDatabase(graphRepository: GraphRepository) = CommandLineRunner {
        this.initGraph(graphRepository)
    }

    fun initGraph(graphRepository: GraphRepository) {
        val graph = Graph(name = "Graph 1")
        graphRepository.save(graph)
        println("Save graph: " + graph)
    }
}
