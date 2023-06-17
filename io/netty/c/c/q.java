/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.b.bi;
import io.netty.c.a.d;
import io.netty.c.c.aa;
import io.netty.c.c.h;
import io.netty.c.c.j;
import io.netty.c.c.r;
import io.netty.c.c.s;
import io.netty.c.c.t;
import io.netty.c.c.u;
import io.netty.c.c.v;
import io.netty.c.c.w;
import io.netty.c.c.x;
import io.netty.c.c.z;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bd;
import io.netty.channel.bp;
import io.netty.channel.bw;
import io.netty.channel.db;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.am;
import io.netty.util.b.ax;
import io.netty.util.c.b.g;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

public class q
extends d
implements bp {
    private static final g c = io.netty.util.c.b.h.a(q.class);
    private static final Pattern d = Pattern.compile("^.*(?:Socket|Datagram|Sctp|Udt)Channel.*$");
    private static final Pattern e = Pattern.compile("^.*(?:connection.*(?:reset|closed|abort|broken)|broken.*pipe).*$", 2);
    private static final SSLException f = new SSLException("SSLEngine closed already");
    private static final SSLException h = new SSLException("handshake timed out");
    private static final ClosedChannelException i = new ClosedChannelException();
    private volatile bd j;
    private final SSLEngine k;
    private final int l;
    private final Executor m;
    private final boolean n;
    private final boolean o;
    private boolean p;
    private final boolean q;
    private boolean r;
    private boolean s;
    private db t;
    private final z u = new z(this, null);
    private final z v = new z(this, null);
    private boolean w;
    private int x;
    private volatile long y = 10000L;
    private volatile long z = 3000L;

    public q(SSLEngine sSLEngine) {
        this(sSLEngine, false);
    }

    public q(SSLEngine sSLEngine, boolean bl2) {
        this(sSLEngine, bl2, am.a);
    }

    public q(SSLEngine sSLEngine, Executor executor) {
        this(sSLEngine, false, executor);
    }

    public q(SSLEngine sSLEngine, boolean bl2, Executor executor) {
        if (sSLEngine == null) {
            throw new NullPointerException("engine");
        }
        if (executor == null) {
            throw new NullPointerException("delegatedTaskExecutor");
        }
        this.k = sSLEngine;
        this.m = executor;
        this.q = bl2;
        this.l = sSLEngine.getSession().getPacketBufferSize();
        this.n = sSLEngine instanceof j;
        this.o = !(sSLEngine instanceof j);
    }

    public long d() {
        return this.y;
    }

    public void a(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.a(timeUnit.toMillis(l2));
    }

    public void a(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("handshakeTimeoutMillis: " + l2 + " (expected: >= 0)");
        }
        this.y = l2;
    }

    public long e() {
        return this.z;
    }

    public void b(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.b(timeUnit.toMillis(l2));
    }

    public void b(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("closeNotifyTimeoutMillis: " + l2 + " (expected: >= 0)");
        }
        this.z = l2;
    }

    public SSLEngine f() {
        return this.k;
    }

    public ab g() {
        return this.u;
    }

    public av h() {
        return this.a(this.j.r());
    }

    public av a(bw bw2) {
        bd bd2 = this.j;
        bd2.e().execute(new r(this, bd2, bw2));
        return bw2;
    }

    public ab i() {
        return this.v;
    }

    @Override
    public void k(bd bd2) {
        if (!this.t.a()) {
            this.t.a(new ar("Pending write on removal of SslHandler"));
        }
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, bw bw2) {
        bd2.a(socketAddress, bw2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        bd2.a(socketAddress, socketAddress2, bw2);
    }

    @Override
    public void c(bd bd2, bw bw2) {
        bd2.c(bw2);
    }

    @Override
    public void a(bd bd2, bw bw2) {
        this.a(bd2, bw2, true);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        this.a(bd2, bw2, false);
    }

    @Override
    public void c(bd bd2) {
        bd2.p();
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.t.a(object, bw2);
    }

    @Override
    public void d(bd bd2) {
        if (this.q && !this.r) {
            this.r = true;
            this.t.c();
            bd2.q();
            return;
        }
        if (this.t.a()) {
            this.t.a(bi.c, bd2.u());
        }
        if (!this.u.isDone()) {
            this.s = true;
        }
        this.a(bd2, false);
        bd2.q();
    }

    /*
     * Exception decompiling
     */
    private void a(bd var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid source, tried to remove [0] lbl48 : GotoStatement: goto lbl4;\u000a\u000afrom [] lbl3 : TryStatement: try { 0[TRYBLOCK]\u000a\u000abut was not a source.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.removeSource(Op03SimpleStatement.java:351)
         * org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer$2.call(FinalAnalyzer.java:259)
         * org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer$2.call(FinalAnalyzer.java:247)
         * org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
         * org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer.identifyFinally(FinalAnalyzer.java:267)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.FinallyRewriter.identifyFinally(FinallyRewriter.java:40)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:513)
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

    private void a(bd bd2, io.netty.b.g g2, bw bw2, boolean bl2) {
        if (g2 == null) {
            g2 = bi.c;
        } else if (!g2.u()) {
            g2.ad();
            g2 = bi.c;
        }
        if (bw2 != null) {
            bd2.a(g2, bw2);
        } else {
            bd2.c(g2);
        }
        if (bl2) {
            this.w = true;
        }
    }

    private void b(bd bd2, boolean bl2) {
        io.netty.util.z z2 = null;
        try {
            SSLEngineResult sSLEngineResult;
            block12: do {
                if (z2 == null) {
                    z2 = this.b(bd2, 0);
                }
                if ((sSLEngineResult = this.a(this.k, bi.c, (io.netty.b.g)z2)).bytesProduced() > 0) {
                    bd2.c(z2);
                    if (bl2) {
                        this.w = true;
                    }
                    z2 = null;
                }
                switch (sSLEngineResult.getHandshakeStatus()) {
                    case FINISHED: {
                        this.o();
                        break;
                    }
                    case NEED_TASK: {
                        this.m();
                        break;
                    }
                    case NEED_UNWRAP: {
                        if (bl2) continue block12;
                        this.l(bd2);
                        break;
                    }
                    case NEED_WRAP: {
                        break;
                    }
                    case NOT_HANDSHAKING: {
                        this.n();
                        if (bl2) continue block12;
                        this.l(bd2);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown handshake status: " + (Object)((Object)sSLEngineResult.getHandshakeStatus()));
                    }
                }
            } while (sSLEngineResult.bytesProduced() != 0);
        }
        catch (SSLException sSLException) {
            this.b(sSLException);
            throw sSLException;
        }
        finally {
            if (z2 != null) {
                z2.ad();
            }
        }
    }

    private SSLEngineResult a(SSLEngine sSLEngine, io.netty.b.g g2, io.netty.b.g g3) {
        SSLEngineResult sSLEngineResult;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = g2.U();
        if (!byteBuffer2.isDirect()) {
            byteBuffer = ByteBuffer.allocateDirect(byteBuffer2.remaining());
            byteBuffer.put(byteBuffer2).flip();
            byteBuffer2 = byteBuffer;
        }
        block3: while (true) {
            byteBuffer = g3.j(g3.q(), g3.s());
            sSLEngineResult = sSLEngine.wrap(byteBuffer2, byteBuffer);
            g2.A(sSLEngineResult.bytesConsumed());
            g3.h(g3.q() + sSLEngineResult.bytesProduced());
            switch (sSLEngineResult.getStatus()) {
                case BUFFER_OVERFLOW: {
                    g3.k(this.l);
                    continue block3;
                }
            }
            break;
        }
        return sSLEngineResult;
    }

    @Override
    public void b(bd bd2) {
        this.b(i);
        super.b(bd2);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        if (this.a(throwable)) {
            if (c.d()) {
                c.b("Swallowing a harmless 'connection reset by peer / broken pipe' error that occurred while writing close_notify in response to the peer's close_notify", throwable);
            }
            if (bd2.b().I()) {
                bd2.n();
            }
        } else {
            bd2.a(throwable);
        }
    }

    private boolean a(Throwable throwable) {
        if (!(throwable instanceof SSLException) && throwable instanceof IOException && this.v.isDone()) {
            StackTraceElement[] arrstackTraceElement;
            String string = String.valueOf(throwable.getMessage()).toLowerCase();
            if (e.matcher(string).matches()) {
                return true;
            }
            for (StackTraceElement stackTraceElement : arrstackTraceElement = throwable.getStackTrace()) {
                String string2 = stackTraceElement.getClassName();
                String string3 = stackTraceElement.getMethodName();
                if (string2.startsWith("io.netty.") || !"read".equals(string3)) continue;
                if (d.matcher(string2).matches()) {
                    return true;
                }
                try {
                    Class<?> class_ = io.netty.util.c.u.a(this.getClass()).loadClass(string2);
                    if (SocketChannel.class.isAssignableFrom(class_) || DatagramChannel.class.isAssignableFrom(class_)) {
                        return true;
                    }
                    if (io.netty.util.c.u.d() >= 7 && "com.sun.nio.sctp.SctpChannel".equals(class_.getSuperclass().getName())) {
                        return true;
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
            }
        }
        return false;
    }

    public static boolean a(io.netty.b.g g2) {
        if (g2.r() < 5) {
            throw new IllegalArgumentException("buffer must have at least 5 readable bytes");
        }
        return io.netty.c.c.q.a(g2, g2.p()) != -1;
    }

    private static int a(io.netty.b.g g2, int n2) {
        short s2;
        boolean bl2;
        int n3 = 0;
        switch (g2.n(n2)) {
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                bl2 = true;
                break;
            }
            default: {
                bl2 = false;
            }
        }
        if (bl2) {
            s2 = g2.n(n2 + 1);
            if (s2 == 3) {
                n3 = g2.p(n2 + 3) + 5;
                if (n3 <= 5) {
                    bl2 = false;
                }
            } else {
                bl2 = false;
            }
        }
        if (!bl2) {
            s2 = 1;
            int n4 = (g2.n(n2) & 0x80) != 0 ? 2 : 3;
            short s3 = g2.n(n2 + n4 + 1);
            if (s3 == 2 || s3 == 3) {
                n3 = n4 == 2 ? (g2.o(n2) & 0x7FFF) + 2 : (g2.o(n2) & 0x3FFF) + 3;
                if (n3 <= n4) {
                    s2 = 0;
                }
            } else {
                s2 = 0;
            }
            if (s2 == 0) {
                return -1;
            }
        }
        return n3;
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        int n2;
        int n3 = g2.p();
        int n4 = g2.q();
        int n5 = n3;
        int n6 = 0;
        if (this.x > 0) {
            if (n4 - n3 < this.x) {
                return;
            }
            n5 += this.x;
            n6 = this.x;
            this.x = 0;
        }
        boolean bl2 = false;
        while (n6 < 18713 && (n2 = n4 - n5) >= 5) {
            int n7 = io.netty.c.c.q.a(g2, n5);
            if (n7 == -1) {
                bl2 = true;
                break;
            }
            assert (n7 > 0);
            if (n7 > n2) {
                this.x = n7;
                break;
            }
            int n8 = n6 + n7;
            if (n8 > 18713) break;
            n5 += n7;
            n6 = n8;
        }
        if (n6 > 0) {
            g2.A(n6);
            ByteBuffer byteBuffer = g2.j(n3, n6);
            this.a(bd2, byteBuffer, n6);
            assert (!byteBuffer.hasRemaining() || this.k.isInboundDone());
        }
        if (bl2) {
            h h2 = new h("not an SSL/TLS record: " + io.netty.b.w.a(g2));
            g2.A(g2.r());
            bd2.a(h2);
            this.b(h2);
        }
    }

    @Override
    public void i(bd bd2) {
        if (this.w) {
            this.w = false;
            bd2.q();
        }
        super.i(bd2);
    }

    private void l(bd bd2) {
        this.a(bd2, bi.c.U(), 0);
    }

    private void a(bd bd2, ByteBuffer byteBuffer, int n2) {
        ByteBuffer byteBuffer2;
        io.netty.b.g g2;
        int n3 = byteBuffer.position();
        if (this.p && byteBuffer.isDirect()) {
            g2 = bd2.d().c(byteBuffer.limit() - n3);
            g2.b(byteBuffer);
            byteBuffer2 = byteBuffer;
            byteBuffer = g2.U();
        } else {
            byteBuffer2 = null;
            g2 = null;
        }
        boolean bl2 = false;
        io.netty.b.g g3 = this.a(bd2, n2);
        try {
            block12: while (true) {
                SSLEngineResult sSLEngineResult = io.netty.c.c.q.a(this.k, byteBuffer, g3);
                SSLEngineResult.Status status = sSLEngineResult.getStatus();
                SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngineResult.getHandshakeStatus();
                int n4 = sSLEngineResult.bytesProduced();
                int n5 = sSLEngineResult.bytesConsumed();
                if (status == SSLEngineResult.Status.CLOSED) {
                    this.v.a_(bd2.b());
                    break;
                }
                switch (handshakeStatus) {
                    case NEED_UNWRAP: {
                        break;
                    }
                    case NEED_WRAP: {
                        this.b(bd2, true);
                        break;
                    }
                    case NEED_TASK: {
                        this.m();
                        break;
                    }
                    case FINISHED: {
                        this.o();
                        bl2 = true;
                        continue block12;
                    }
                    case NOT_HANDSHAKING: {
                        if (this.n()) {
                            bl2 = true;
                            continue block12;
                        }
                        if (!this.s) break;
                        this.s = false;
                        bl2 = true;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown handshake status: " + (Object)((Object)handshakeStatus));
                    }
                }
                if (status == SSLEngineResult.Status.BUFFER_UNDERFLOW || n5 == 0 && n4 == 0) break;
            }
            if (bl2) {
                this.a(bd2, true);
            }
        }
        catch (SSLException sSLException) {
            this.b(sSLException);
            throw sSLException;
        }
        finally {
            if (g2 != null) {
                byteBuffer2.position(n3 + byteBuffer.position());
                g2.ad();
            }
            if (g3.u()) {
                bd2.b(g3);
            } else {
                g3.ad();
            }
        }
    }

    private static SSLEngineResult a(SSLEngine sSLEngine, ByteBuffer byteBuffer, io.netty.b.g g2) {
        SSLEngineResult sSLEngineResult;
        int n2 = 0;
        block6: while (true) {
            ByteBuffer byteBuffer2 = g2.j(g2.q(), g2.s());
            sSLEngineResult = sSLEngine.unwrap(byteBuffer, byteBuffer2);
            g2.h(g2.q() + sSLEngineResult.bytesProduced());
            switch (sSLEngineResult.getStatus()) {
                case BUFFER_OVERFLOW: {
                    int n3 = sSLEngine.getSession().getApplicationBufferSize();
                    switch (n2++) {
                        case 0: {
                            g2.k(Math.min(n3, byteBuffer.remaining()));
                            continue block6;
                        }
                    }
                    g2.k(n3);
                    continue block6;
                }
            }
            break;
        }
        return sSLEngineResult;
    }

    private void m() {
        if (this.m == am.a) {
            Runnable runnable;
            while ((runnable = this.k.getDelegatedTask()) != null) {
                runnable.run();
            }
        } else {
            Object object;
            ArrayList<Runnable> arrayList = new ArrayList<Runnable>(2);
            while ((object = this.k.getDelegatedTask()) != null) {
                arrayList.add((Runnable)object);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            object = new CountDownLatch(1);
            this.m.execute(new s(this, arrayList, (CountDownLatch)object));
            boolean bl2 = false;
            while (((CountDownLatch)object).getCount() != 0L) {
                try {
                    ((CountDownLatch)object).await();
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                }
            }
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private boolean n() {
        if (!this.u.isDone()) {
            this.o();
            return true;
        }
        return false;
    }

    private void o() {
        String string = String.valueOf(this.k.getSession().getCipherSuite());
        if (!this.n && (string.contains("_GCM_") || string.contains("-GCM-"))) {
            this.p = true;
        }
        if (this.u.a_(this.j.b())) {
            if (c.d()) {
                c.b(this.j.b() + " HANDSHAKEN: " + this.k.getSession().getCipherSuite());
            }
            this.j.a(aa.a);
        }
    }

    private void b(Throwable throwable) {
        block2: {
            this.k.closeOutbound();
            try {
                this.k.closeInbound();
            }
            catch (SSLException sSLException) {
                String string = sSLException.getMessage();
                if (string != null && string.contains("possible truncation attack")) break block2;
                c.b("SSLEngine.closeInbound() raised an exception.", sSLException);
            }
        }
        this.c(throwable);
        this.t.a(throwable);
    }

    private void c(Throwable throwable) {
        if (this.u.b(throwable)) {
            this.j.a(new aa(throwable));
            this.j.n();
        }
    }

    private void a(bd bd2, bw bw2, boolean bl2) {
        if (!bd2.b().I()) {
            if (bl2) {
                bd2.a(bw2);
            } else {
                bd2.b(bw2);
            }
            return;
        }
        this.k.closeOutbound();
        bw bw3 = bd2.r();
        this.a(bd2, (Object)bi.c, bw3);
        this.d(bd2);
        this.a(bd2, (av)bw3, bw2);
    }

    @Override
    public void e(bd bd2) {
        this.j = bd2;
        this.t = new db(bd2);
        if (bd2.b().I() && this.k.getUseClientMode()) {
            this.p();
        }
    }

    private ab p() {
        ax ax2 = this.y > 0L ? this.j.e().a(new t(this), this.y, TimeUnit.MILLISECONDS) : null;
        this.u.l((ad)new u(this, ax2));
        try {
            this.k.beginHandshake();
            this.b(this.j, false);
            this.j.q();
        }
        catch (Exception exception) {
            this.c(exception);
        }
        return this.u;
    }

    @Override
    public void a(bd bd2) {
        if (!this.q && this.k.getUseClientMode()) {
            this.p().a_((ad)new v(this, bd2));
        }
        bd2.i();
    }

    private void a(bd bd2, av av2, bw bw2) {
        if (!bd2.b().I()) {
            bd2.b(bw2);
            return;
        }
        ax ax2 = this.z > 0L ? bd2.e().a(new w(this, bd2, bw2), this.z, TimeUnit.MILLISECONDS) : null;
        av2.a((ad)new x(this, ax2, bd2, bw2));
    }

    private io.netty.b.g a(bd bd2, int n2) {
        io.netty.b.h h2 = bd2.d();
        if (this.n) {
            return h2.d(n2);
        }
        return h2.a(n2);
    }

    private io.netty.b.g b(bd bd2, int n2) {
        if (this.o) {
            return this.a(bd2, this.l);
        }
        return this.a(bd2, Math.min(n2 + 2329, this.l));
    }

    static /* synthetic */ SSLEngine a(q q2) {
        return q2.k;
    }

    static /* synthetic */ g j() {
        return c;
    }

    static /* synthetic */ bd b(q q2) {
        return q2.j;
    }

    static /* synthetic */ z c(q q2) {
        return q2.u;
    }

    static /* synthetic */ SSLException l() {
        return h;
    }

    static /* synthetic */ void a(q q2, Throwable throwable) {
        q2.c(throwable);
    }

    static {
        f.setStackTrace(io.netty.util.c.d.k);
        h.setStackTrace(io.netty.util.c.d.k);
        i.setStackTrace(io.netty.util.c.d.k);
    }
}

