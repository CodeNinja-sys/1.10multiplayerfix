/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.f;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class ag
extends Random {
    private static final g b = io.netty.util.c.b.h.a(ag.class);
    private static final AtomicLong c = new AtomicLong();
    private static volatile long d;
    private static final long e = 25214903917L;
    private static final long f = 11L;
    private static final long g = 0xFFFFFFFFFFFFL;
    private long h;
    boolean a = true;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private static final long q = -5851777807851030925L;

    public static void a(long l2) {
        d = l2;
    }

    /*
     * Exception decompiling
     */
    public static synchronized long a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static long d() {
        long l2;
        long l3;
        long l4;
        long l5 = System.nanoTime();
        while (!c.compareAndSet(l4, l3 = (l2 = (l4 = c.get()) != 0L ? l4 : ag.a()) * 181783497276652981L)) {
        }
        if (l4 == 0L && b.d()) {
            b.b(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x (took %d ms)", l2, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l5)));
        }
        return l3 ^ System.nanoTime();
    }

    ag() {
        super(ag.d());
    }

    public static ag b() {
        return io.netty.util.c.f.b().l();
    }

    @Override
    public void setSeed(long l2) {
        if (this.a) {
            throw new UnsupportedOperationException();
        }
        this.h = (l2 ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL;
    }

    @Override
    protected int next(int n2) {
        this.h = this.h * 25214903917L + 11L & 0xFFFFFFFFFFFFL;
        return (int)(this.h >>> 48 - n2);
    }

    public int a(int n2, int n3) {
        if (n2 >= n3) {
            throw new IllegalArgumentException();
        }
        return this.nextInt(n3 - n2) + n2;
    }

    public long b(long l2) {
        if (l2 <= 0L) {
            throw new IllegalArgumentException("n must be positive");
        }
        long l3 = 0L;
        while (l2 >= Integer.MAX_VALUE) {
            long l4;
            int n2 = this.next(2);
            long l5 = l2 >>> 1;
            long l6 = l4 = (n2 & 2) == 0 ? l5 : l2 - l5;
            if ((n2 & 1) == 0) {
                l3 += l2 - l4;
            }
            l2 = l4;
        }
        return l3 + (long)this.nextInt((int)l2);
    }

    public long a(long l2, long l3) {
        if (l2 >= l3) {
            throw new IllegalArgumentException();
        }
        return this.b(l3 - l2) + l2;
    }

    public double a(double d2) {
        if (d2 <= 0.0) {
            throw new IllegalArgumentException("n must be positive");
        }
        return this.nextDouble() * d2;
    }

    public double a(double d2, double d3) {
        if (d2 >= d3) {
            throw new IllegalArgumentException();
        }
        return this.nextDouble() * (d3 - d2) + d2;
    }

    static /* synthetic */ g c() {
        return b;
    }
}

