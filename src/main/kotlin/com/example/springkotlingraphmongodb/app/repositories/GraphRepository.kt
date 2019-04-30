package com.example.springkotlingraphmongodb.app.repositories

import com.example.springkotlingraphmongodb.app.entities.Graph
import org.springframework.data.mongodb.repository.MongoRepository

interface GraphRepository : MongoRepository<Graph, String>
