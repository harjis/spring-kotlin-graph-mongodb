package com.example.springkotlingraphmongodb.app.entities

import org.springframework.data.annotation.Id
import java.util.*

data class Graph(
        @Id val id: UUID = UUID.randomUUID(),
        val name: String,
        val nodes: List<Node> = emptyList(),
        val edges: List<Edge> = emptyList()
)
