/*
 * MIT License
 *
 * Copyright (c)  2021 Jose Osuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.prottonne.interfaces;

public interface IService extends ISuperService {
    int MY_STATIC_CONSTANT = 15; // a constant, static and final

    void myAbstractMethod(); // this is public and abstract method

    private String myConcreteMethod() { // this is a private concrete method
        return "I would be call by default method";
    }

    default String myDefaultMethod() { // this is a public default method
        return myConcreteMethod();
    }

    static int myStaticMethod() { // this is a static
        return MY_STATIC_CONSTANT;
    }

    private static String myPrivateStaticMethod() {
        return "all static are concrete";
    }
}
