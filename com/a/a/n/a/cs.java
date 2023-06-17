/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.d.aad;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.ov;
import com.a.a.n.a.ct;
import com.a.a.n.a.cu;
import com.a.a.n.a.cy;
import com.a.a.n.a.dl;
import com.a.a.n.a.du;
import com.a.a.n.a.g;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

class cs
extends g {
    private static final Logger h = Logger.getLogger(cs.class.getName());
    iz a;
    final boolean b;
    final AtomicInteger c;
    cy d;
    List e;
    final Object f = new Object();
    Set g;

    cs(iz iz2, boolean bl2, Executor executor, cy cy2) {
        this.a = iz2;
        this.b = bl2;
        this.c = new AtomicInteger(iz2.size());
        this.d = cy2;
        this.e = ov.b(iz2.size());
        this.a(executor);
    }

    protected void a(Executor executor) {
        int n2;
        this.a(new ct(this), du.a());
        if (this.a.isEmpty()) {
            this.a(this.d.b(jl.d()));
            return;
        }
        for (n2 = 0; n2 < this.a.size(); ++n2) {
            this.e.add(null);
        }
        n2 = 0;
        for (dl dl2 : this.a) {
            int n3 = n2++;
            dl2.a(new cu(this, n3, dl2), executor);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(Throwable throwable) {
        boolean bl2 = false;
        boolean bl3 = true;
        if (this.b) {
            bl2 = super.a(throwable);
            Object object = this.f;
            synchronized (object) {
                if (this.g == null) {
                    this.g = aad.a();
                }
                bl3 = this.g.add(throwable);
            }
        }
        if (throwable instanceof Error || this.b && !bl2 && bl3) {
            h.log(Level.SEVERE, "input future failed.", throwable);
        }
    }

    /*
     * Exception decompiling
     */
    private void a(int var1_1, Future var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
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

    static /* synthetic */ void a(cs cs2, int n2, Future future) {
        cs2.a(n2, future);
    }
}

