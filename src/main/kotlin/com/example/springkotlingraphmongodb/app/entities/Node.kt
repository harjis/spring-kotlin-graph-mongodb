package com.example.springkotlingraphmongodb.app.entities

import java.util.UUID

data class Node(val id: UUID = UUID.randomUUID(), val name: String)
