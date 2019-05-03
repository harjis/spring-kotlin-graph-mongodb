package com.example.springkotlingraphmongodb.app.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "graphs")
data class Graph(
        @Id val id: String? = null,
        val name: String,
        val nodes: List<Node> = emptyList(),
        val edges: List<Edge> = emptyList()
)
