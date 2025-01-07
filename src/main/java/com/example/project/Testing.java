package com.example.project;

public class Testing {
    public static void main(String[] args) {
        TriangleCollection collection1 = new TriangleCollection(6,4,7);
        collection1.shiftTriangles(5);
        System.out.println(collection1.triangleCollectionInfo());
    }
}
