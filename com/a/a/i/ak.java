/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.ov;
import com.a.a.i.aj;
import com.a.a.i.al;
import com.a.a.i.ao;
import com.a.a.i.ap;
import com.a.a.i.aq;
import com.a.a.i.ax;
import com.a.a.i.cc;
import com.a.a.i.ce;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class ak
implements cc {
    protected ak() {
    }

    public abstract Reader a();

    public final Reader b() {
        return this.a();
    }

    public BufferedReader c() {
        Reader reader = this.a();
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    public long a(Appendable appendable) {
        cl.a(appendable);
        ax ax2 = ax.a();
        try {
            Reader reader = (Reader)ax2.a(this.a());
            long l2 = aq.a((Readable)reader, appendable);
            return l2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public long a(aj aj2) {
        cl.a(aj2);
        ax ax2 = ax.a();
        try {
            Reader reader = (Reader)ax2.a(this.a());
            Writer writer = (Writer)ax2.a(aj2.a());
            long l2 = aq.a((Readable)reader, (Appendable)writer);
            return l2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public String d() {
        ax ax2 = ax.a();
        try {
            Reader reader = (Reader)ax2.a(this.a());
            String string = aq.a(reader);
            return string;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public String e() {
        ax ax2 = ax.a();
        try {
            BufferedReader bufferedReader = (BufferedReader)ax2.a(this.c());
            String string = bufferedReader.readLine();
            return string;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public jl f() {
        ax ax2 = ax.a();
        try {
            String string;
            BufferedReader bufferedReader = (BufferedReader)ax2.a(this.c());
            ArrayList arrayList = ov.a();
            while ((string = bufferedReader.readLine()) != null) {
                arrayList.add(string);
            }
            jl jl2 = jl.a(arrayList);
            return jl2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public Object a(ce ce2) {
        cl.a(ce2);
        ax ax2 = ax.a();
        try {
            Reader reader = (Reader)ax2.a(this.a());
            Object object = aq.a((Readable)reader, ce2);
            return object;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public boolean g() {
        ax ax2 = ax.a();
        try {
            Reader reader = (Reader)ax2.a(this.a());
            boolean bl2 = reader.read() == -1;
            return bl2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public static ak a(Iterable iterable) {
        return new ao(iterable);
    }

    public static ak a(Iterator iterator) {
        return ak.a(jl.a(iterator));
    }

    public static ak a(ak ... arrak) {
        return ak.a(jl.a(arrak));
    }

    public static ak a(CharSequence charSequence) {
        return new al(charSequence);
    }

    public static ak i() {
        return ap.k();
    }

    @Override
    public /* synthetic */ Object h() {
        return this.b();
    }
}

