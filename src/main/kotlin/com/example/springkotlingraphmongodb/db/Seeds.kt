package com.example.springkotlingraphmongodb.db

import com.example.springkotlingraphmongodb.app.entities.Edge
import com.example.springkotlingraphmongodb.app.entities.Graph
import com.example.springkotlingraphmongodb.app.entities.Node
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
        val node = Node(name = "Node 1")
        val node2 = Node(name = "Node 2")
        val edge = Edge(fromNodeId = node.id, toNodeId = node2.id)
        val graph = Graph(name = "Graph 1", nodes = listOf(node), edges = listOf(edge))
        graphRepository.save(graph)
        println("Save graph: " + graph)
    }
}
