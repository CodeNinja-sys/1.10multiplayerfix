/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class l
implements Iterator {
    private final Iterator a;
    private final Iterator b;
    private Iterator c;

    l(Iterator iterator, Iterator iterator2) {
        if (iterator == null) {
            throw new NullPointerException("i1");
        }
        if (iterator2 == null) {
            throw new NullPointerException("i2");
        }
        this.a = iterator;
        this.b = iterator2;
        this.c = iterator;
    }

    @Override
    public boolean hasNext() {
        while (true) {
            if (this.c.hasNext()) {
                return true;
            }
            if (this.c != this.a) break;
            this.c = this.b;
        }
        return false;
    }

    public Object next() {
        while (true) {
            try {
                return this.c.next();
            }
            catch (NoSuchElementException noSuchElementException) {
                if (this.c == this.a) {
                    this.c = this.b;
                    continue;
                }
                throw noSuchElementException;
            }
            break;
        }
    }

    @Override
    public void remove() {
        this.c.remove();
    }
}

