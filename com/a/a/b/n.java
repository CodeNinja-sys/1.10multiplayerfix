/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.m;

final class n
extends m {
    n() {
    }

    @Override
    public boolean c(char c2) {
        switch (c2) {
            case '\t': 
            case '\n': 
            case '\u000b': 
            case '\f': 
            case '\r': 
            case ' ': 
            case '\u0085': 
            case '\u1680': 
            case '\u2028': 
            case '\u2029': 
            case '\u205f': 
            case '\u3000': {
                return true;
            }
            case '\u2007': {
                return false;
            }
        }
        return c2 >= '\u2000' && c2 <= '\u200a';
    }

    @Override
    public String toString() {
        return "CharMatcher.BREAKING_WHITESPACE";
    }
}

