/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.aa;
import com.a.b.ag;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.f;
import com.a.b.w;
import com.a.b.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class af
implements Iterator {
    private final a a;
    private final Object b;

    public af(String string) {
        this(new StringReader(string));
    }

    public af(Reader reader) {
        this.a = new a(reader);
        this.a.a(true);
        this.b = new Object();
    }

    public w a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return com.a.b.b.ag.a(this.a);
        }
        catch (StackOverflowError stackOverflowError) {
            throw new aa("Failed parsing JSON source to Json", stackOverflowError);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw new aa("Failed parsing JSON source to Json", outOfMemoryError);
        }
        catch (aa aa2) {
            throw aa2.getCause() instanceof EOFException ? new NoSuchElementException() : aa2;
        }
    }

    public boolean hasNext() {
        Object object = this.b;
        synchronized (object) {
            try {
                return this.a.f() != d.j;
            }
            catch (f f2) {
                throw new ag(f2);
            }
            catch (IOException iOException) {
                throw new x(iOException);
            }
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

