/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.b.t;

public class u
implements Iterator {
    private final BufferedReader a;
    private String b;
    private boolean c = false;

    public u(Reader reader) {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        }
        this.a = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    @Override
    public boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        if (this.c) {
            return false;
        }
        try {
            String string;
            do {
                if ((string = this.a.readLine()) != null) continue;
                this.c = true;
                return false;
            } while (!this.a(string));
            this.b = string;
            return true;
        }
        catch (IOException iOException) {
            this.c();
            throw new IllegalStateException(iOException);
        }
    }

    protected boolean a(String string) {
        return true;
    }

    public String a() {
        return this.b();
    }

    public String b() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String string = this.b;
        this.b = null;
        return string;
    }

    public void c() {
        this.c = true;
        t.a(this.a);
        this.b = null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }

    public static void a(u u2) {
        if (u2 != null) {
            u2.c();
        }
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

