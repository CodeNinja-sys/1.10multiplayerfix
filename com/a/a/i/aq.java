/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.d.mq;
import com.a.a.i.a;
import com.a.a.i.aj;
import com.a.a.i.ak;
import com.a.a.i.ar;
import com.a.a.i.as;
import com.a.a.i.at;
import com.a.a.i.au;
import com.a.a.i.av;
import com.a.a.i.ax;
import com.a.a.i.cc;
import com.a.a.i.ce;
import com.a.a.i.cf;
import com.a.a.i.cl;
import com.a.a.i.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class aq {
    private static final int a = 2048;

    private aq() {
    }

    public static cc a(String string) {
        return aq.a(ak.a(string));
    }

    public static cc a(cc cc2, Charset charset) {
        return aq.a(z.c(cc2).a(charset));
    }

    public static cl a(cl cl2, Charset charset) {
        return aq.a(z.a(cl2).a(charset));
    }

    public static void a(CharSequence charSequence, cl cl2) {
        aq.a(cl2).a(charSequence);
    }

    public static long a(cc cc2, cl cl2) {
        return aq.d(cc2).a(aq.a(cl2));
    }

    public static long a(cc cc2, Appendable appendable) {
        return aq.d(cc2).a(appendable);
    }

    public static long a(Readable readable, Appendable appendable) {
        com.a.a.b.cl.a(readable);
        com.a.a.b.cl.a(appendable);
        CharBuffer charBuffer = CharBuffer.allocate(2048);
        long l2 = 0L;
        while (readable.read(charBuffer) != -1) {
            charBuffer.flip();
            appendable.append(charBuffer);
            l2 += (long)charBuffer.remaining();
            charBuffer.clear();
        }
        return l2;
    }

    public static String a(Readable readable) {
        return aq.d(readable).toString();
    }

    public static String a(cc cc2) {
        return aq.d(cc2).d();
    }

    private static StringBuilder d(Readable readable) {
        StringBuilder stringBuilder = new StringBuilder();
        aq.a(readable, (Appendable)stringBuilder);
        return stringBuilder;
    }

    public static String b(cc cc2) {
        return aq.d(cc2).e();
    }

    public static List c(cc cc2) {
        ax ax2 = ax.a();
        try {
            Readable readable = (Readable)((Object)ax2.a((Closeable)cc2.h()));
            List list = aq.b(readable);
            return list;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public static List b(Readable readable) {
        String string;
        ArrayList<String> arrayList = new ArrayList<String>();
        cf cf2 = new cf(readable);
        while ((string = cf2.a()) != null) {
            arrayList.add(string);
        }
        return arrayList;
    }

    public static Object a(Readable readable, ce ce2) {
        String string;
        com.a.a.b.cl.a(readable);
        com.a.a.b.cl.a(ce2);
        cf cf2 = new cf(readable);
        while ((string = cf2.a()) != null && ce2.a(string)) {
        }
        return ce2.b();
    }

    public static Object a(cc cc2, ce ce2) {
        com.a.a.b.cl.a(cc2);
        com.a.a.b.cl.a(ce2);
        ax ax2 = ax.a();
        try {
            Readable readable = (Readable)((Object)ax2.a((Closeable)cc2.h()));
            Object object = aq.a(readable, ce2);
            return object;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public static cc a(Iterable iterable) {
        com.a.a.b.cl.a(iterable);
        Iterable iterable2 = mq.a(iterable, new ar());
        return aq.a(ak.a(iterable2));
    }

    public static cc a(cc ... arrcc) {
        return aq.a(Arrays.asList(arrcc));
    }

    public static void a(Reader reader, long l2) {
        com.a.a.b.cl.a(reader);
        while (l2 > 0L) {
            long l3 = reader.skip(l2);
            if (l3 == 0L) {
                if (reader.read() == -1) {
                    throw new EOFException();
                }
                --l2;
                continue;
            }
            l2 -= l3;
        }
    }

    public static Writer a() {
        return av.a();
    }

    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer)appendable;
        }
        return new a(appendable);
    }

    static Reader c(Readable readable) {
        com.a.a.b.cl.a(readable);
        if (readable instanceof Reader) {
            return (Reader)readable;
        }
        return new as(readable);
    }

    public static ak d(cc cc2) {
        com.a.a.b.cl.a(cc2);
        return new at(cc2);
    }

    public static aj a(cl cl2) {
        com.a.a.b.cl.a(cl2);
        return new au(cl2);
    }

    static cc a(ak ak2) {
        return (cc)com.a.a.b.cl.a(ak2);
    }

    static cl a(aj aj2) {
        return (cl)com.a.a.b.cl.a(aj2);
    }
}

