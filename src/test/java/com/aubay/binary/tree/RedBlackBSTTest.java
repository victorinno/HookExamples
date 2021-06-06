package com.aubay.binary.tree;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

class RedBlackBSTTest {

    @Test
    void size() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        keyObjectRedBlackBST.put(1L, 1L);
        assertEquals(1l, keyObjectRedBlackBST.size());
        LongStream.generate(() -> (long) (Math.random() * 10000)).limit(10).forEach(l -> keyObjectRedBlackBST.put(l, l));
        assertEquals(11l, keyObjectRedBlackBST.size());

    }

    @Test
    void isEmpty() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        assertTrue(keyObjectRedBlackBST.isEmpty());
        keyObjectRedBlackBST.put(1L, 1L);
        assertFalse(keyObjectRedBlackBST.isEmpty());
    }

    @Test
    void get() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        keyObjectRedBlackBST.put(1L, 1L);
        assertEquals(1l, keyObjectRedBlackBST.get(1l));
    }

    @Test
    void contains() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        keyObjectRedBlackBST.put(1L, 1L);
        assertTrue(keyObjectRedBlackBST.contains(1l));
    }

    @Test
    void put() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        AtomicLong atomicLong = new AtomicLong();
        LongStream limit = LongStream.generate(atomicLong::incrementAndGet).limit(10);
        limit.forEach(l -> {
            keyObjectRedBlackBST.put(l, l);
            assertEquals(l, keyObjectRedBlackBST.get(l));
        });

    }

    @Test
    void delete() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        AtomicLong atomicLong = new AtomicLong();
        LongStream limit = LongStream.generate(atomicLong::incrementAndGet).limit(10);
        limit.forEach(l -> keyObjectRedBlackBST.put(l, l));
        assertEquals(5L, keyObjectRedBlackBST.get(5L));
        keyObjectRedBlackBST.delete(5L);
        assertFalse(keyObjectRedBlackBST.contains(5L));
    }

    @Test
    void height() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        AtomicLong atomicLong = new AtomicLong();
        LongStream limit = LongStream.generate(atomicLong::incrementAndGet).limit(10);
        limit.forEach(l -> keyObjectRedBlackBST.put(l, l));
        assertEquals(3, keyObjectRedBlackBST.height());
    }

    @Test
    void min() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        AtomicLong atomicLong = new AtomicLong();
        LongStream limit = LongStream.generate(atomicLong::incrementAndGet).limit(10);
        limit.forEach(l -> keyObjectRedBlackBST.put(l, l));
        assertEquals(1l, keyObjectRedBlackBST.min());
    }

    @Test
    void max() {
        RedBlackBST<Long, Long> keyObjectRedBlackBST = new RedBlackBST<>();
        AtomicLong atomicLong = new AtomicLong();
        LongStream limit = LongStream.generate(atomicLong::incrementAndGet).limit(10);
        limit.forEach(l -> keyObjectRedBlackBST.put(l, l));
        assertEquals(10l, keyObjectRedBlackBST.max());
    }
}