/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.k.a;
import net.minecraft.k.j;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.k.p;

public class i {
    private final a a;
    private final String b;
    private final List c = ov.a();
    private StackTraceElement[] d = new StackTraceElement[0];

    public i(a a2, String string) {
        this.a = a2;
        this.b = string;
    }

    public static String a(double d2, double d3, double d4) {
        return String.format("%.2f,%.2f,%.2f - %s", d2, d3, d4, i.a(new net.minecraft.u.b.b(d2, d3, d4)));
    }

    public static String a(net.minecraft.u.b.b b2) {
        return i.a(b2.cy_(), b2.k(), b2.l());
    }

    public static String a(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(String.format("World: (%d,%d,%d)", n2, n3, n4));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n13 = n2 >> 4;
            n12 = n4 >> 4;
            n11 = n2 & 0xF;
            n10 = n3 >> 4;
            n9 = n4 & 0xF;
            n8 = n13 << 4;
            n7 = n12 << 4;
            n6 = (n13 + 1 << 4) - 1;
            n5 = (n12 + 1 << 4) - 1;
            stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", n11, n10, n9, n13, n12, n8, n7, n6, n5));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            int n14 = n2 >> 9;
            n12 = n4 >> 9;
            n11 = n14 << 5;
            n10 = n12 << 5;
            n9 = (n14 + 1 << 5) - 1;
            n8 = (n12 + 1 << 5) - 1;
            n7 = n14 << 9;
            n6 = n12 << 9;
            n5 = (n14 + 1 << 9) - 1;
            int n15 = (n12 + 1 << 9) - 1;
            stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n14, n12, n11, n10, n9, n8, n7, n6, n5, n15));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }

    public void a(String string, p p2) {
        try {
            this.a(string, p2.call());
        }
        catch (Throwable throwable) {
            this.a(string, throwable);
        }
    }

    public void a(String string, Object object) {
        this.c.add(new o(string, object));
    }

    public void a(String string, Throwable throwable) {
        this.a(string, (Object)throwable);
    }

    public int a(int n2) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        if (arrstackTraceElement.length <= 0) {
            return 0;
        }
        this.d = new StackTraceElement[arrstackTraceElement.length - 3 - n2];
        System.arraycopy(arrstackTraceElement, 3 + n2, this.d, 0, this.d.length);
        return this.d.length;
    }

    public boolean a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.d.length != 0 && stackTraceElement != null) {
            StackTraceElement stackTraceElement3 = this.d[0];
            if (stackTraceElement3.isNativeMethod() == stackTraceElement.isNativeMethod() && stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) && stackTraceElement3.getFileName().equals(stackTraceElement.getFileName()) && stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName())) {
                if (stackTraceElement2 != null != this.d.length > 1) {
                    return false;
                }
                if (stackTraceElement2 != null && !this.d[1].equals(stackTraceElement2)) {
                    return false;
                }
                this.d[0] = stackTraceElement;
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(int n2) {
        StackTraceElement[] arrstackTraceElement = new StackTraceElement[this.d.length - n2];
        System.arraycopy(this.d, 0, arrstackTraceElement, 0, arrstackTraceElement.length);
        this.d = arrstackTraceElement;
    }

    public void a(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append(this.b).append(" --\n");
        stringBuilder.append("Details:");
        for (Object object : this.c) {
            stringBuilder.append("\n\t");
            stringBuilder.append(((o)object).a());
            stringBuilder.append(": ");
            stringBuilder.append(((o)object).b());
        }
        if (this.d != null && this.d.length > 0) {
            stringBuilder.append("\nStacktrace:");
            StackTraceElement[] arrstackTraceElement = this.d;
            int n2 = this.d.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object;
                object = arrstackTraceElement[i2];
                stringBuilder.append("\n\tat ");
                stringBuilder.append(object);
            }
        }
    }

    public StackTraceElement[] a() {
        return this.d;
    }

    public static void a(i i2, net.minecraft.u.b.b b2, cn cn2, int n2) {
        int n3 = cn.c(cn2);
        i2.a("Block type", new j(n3, cn2));
        i2.a("Block data value", new k(n2));
        i2.a("Block location", new l(b2));
    }

    public static void a(i i2, net.minecraft.u.b.b b2, b b3) {
        i2.a("Block", new m(b3));
        i2.a("Block location", new n(b2));
    }
}

