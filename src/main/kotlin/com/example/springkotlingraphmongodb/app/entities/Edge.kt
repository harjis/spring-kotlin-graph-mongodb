package com.example.springkotlingraphmongodb.app.entities

import java.util.*

data class Edge(val id: UUID = UUID.randomUUID(), val fromNodeId: UUID, val toNodeId: UUID)
