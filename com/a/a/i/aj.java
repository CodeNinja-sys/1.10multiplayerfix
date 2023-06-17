/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.aq;
import com.a.a.i.ax;
import com.a.a.i.cl;
import java.io.BufferedWriter;
import java.io.Writer;

public abstract class aj
implements cl {
    protected aj() {
    }

    public abstract Writer a();

    public final Writer b() {
        return this.a();
    }

    public Writer c() {
        Writer writer = this.a();
        return writer instanceof BufferedWriter ? (BufferedWriter)writer : new BufferedWriter(writer);
    }

    public void a(CharSequence charSequence) {
        com.a.a.b.cl.a(charSequence);
        ax ax2 = ax.a();
        try {
            Writer writer = (Writer)ax2.a(this.a());
            writer.append(charSequence);
            writer.flush();
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public void a(Iterable iterable) {
        this.a(iterable, System.getProperty("line.separator"));
    }

    public void a(Iterable iterable, String string) {
        com.a.a.b.cl.a(iterable);
        com.a.a.b.cl.a(string);
        ax ax2 = ax.a();
        try {
            Writer writer = (Writer)ax2.a(this.c());
            for (CharSequence charSequence : iterable) {
                writer.append(charSequence).append(string);
            }
            writer.flush();
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public long a(Readable readable) {
        com.a.a.b.cl.a(readable);
        ax ax2 = ax.a();
        try {
            Writer writer = (Writer)ax2.a(this.a());
            long l2 = aq.a(readable, (Appendable)writer);
            writer.flush();
            long l3 = l2;
            return l3;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    @Override
    public /* synthetic */ Object d() {
        return this.b();
    }
}

