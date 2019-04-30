package com.example.springkotlingraphmongodb.app.entities

import org.springframework.data.annotation.Id

data class Graph(
        @Id val id: String,
        val name: String,
        val nodes: List<Node> = emptyList(),
        val edges: List<Edge> = emptyList()
)
