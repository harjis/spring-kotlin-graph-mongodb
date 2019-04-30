package com.example.springkotlingraphmongodb.app.controllers

import com.example.springkotlingraphmongodb.app.entities.Graph
import com.example.springkotlingraphmongodb.app.expections.EntityNotFoundException
import com.example.springkotlingraphmongodb.app.repositories.GraphRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/graphs"])
class GraphController(val graphRepository: GraphRepository) {
    @GetMapping("")
    fun index(): MutableList<Graph> {
        return graphRepository.findAll()
    }

    @GetMapping("/{id}")
    fun show(@PathVariable id: String): Graph {
        println(graphRepository.findById(id))
        return graphRepository.findById(id).orElseThrow { throw EntityNotFoundException("Entity not found with id: " + id.toString()) }
    }
}
