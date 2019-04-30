package com.example.springkotlingraphmongodb.app.controllers

import com.example.springkotlingraphmongodb.app.entities.Graph
import com.example.springkotlingraphmongodb.app.repositories.GraphRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/graphs"])
class GraphController(val graphRepository: GraphRepository) {
    @GetMapping("")
    fun index(): MutableList<Graph> {
        return graphRepository.findAll()
    }
}
