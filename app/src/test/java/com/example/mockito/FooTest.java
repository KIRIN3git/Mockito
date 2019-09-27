package com.example.mockito;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FooTest {
    @Test
    public void testClassTest() {
        // モックを作成
        Foo foo = mock(Foo.class);

        // 返り値をモックする。
        when(foo.foo()).thenReturn("kaba");

        // testを作成。
        assertEquals(foo.foo(), "kaba");
    }
}

