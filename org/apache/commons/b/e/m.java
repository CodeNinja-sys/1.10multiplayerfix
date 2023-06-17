/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class m
extends FilterWriter {
    public m(Writer writer) {
        super(writer);
    }

    @Override
    public Writer append(char c2) {
        try {
            this.a(1);
            this.out.append(c2);
            this.b(1);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) {
        try {
            this.a(n3 - n2);
            this.out.append(charSequence, n2, n3);
            this.b(n3 - n2);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence) {
        try {
            int n2 = 0;
            if (charSequence != null) {
                n2 = charSequence.length();
            }
            this.a(n2);
            this.out.append(charSequence);
            this.b(n2);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
        return this;
    }

    @Override
    public void write(int n2) {
        try {
            this.a(1);
            this.out.write(n2);
            this.b(1);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void write(char[] arrc) {
        try {
            int n2 = 0;
            if (arrc != null) {
                n2 = arrc.length;
            }
            this.a(n2);
            this.out.write(arrc);
            this.b(n2);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        try {
            this.a(n3);
            this.out.write(arrc, n2, n3);
            this.b(n3);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void write(String string) {
        try {
            int n2 = 0;
            if (string != null) {
                n2 = string.length();
            }
            this.a(n2);
            this.out.write(string);
            this.b(n2);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void write(String string, int n2, int n3) {
        try {
            this.a(n3);
            this.out.write(string, n2, n3);
            this.b(n3);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void flush() {
        try {
            this.out.flush();
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void close() {
        try {
            this.out.close();
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    protected void a(int n2) {
    }

    protected void b(int n2) {
    }

    protected void a(IOException iOException) {
        throw iOException;
    }
}

