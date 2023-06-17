/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.tomcat.jni.Pool
 *  org.apache.tomcat.jni.SSL
 *  org.apache.tomcat.jni.SSLContext
 */
package io.netty.c.c;

import io.netty.b.h;
import io.netty.c.c.i;
import io.netty.c.c.j;
import io.netty.c.c.m;
import io.netty.c.c.o;
import io.netty.util.c.b.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import org.apache.tomcat.jni.Pool;
import org.apache.tomcat.jni.SSL;
import org.apache.tomcat.jni.SSLContext;

public final class l
extends o {
    private static final g a = io.netty.util.c.b.h.a(l.class);
    private static final List b;
    private final long c;
    private final List d = new ArrayList();
    private final List e = Collections.unmodifiableList(this.d);
    private final long f;
    private final long g;
    private final List h;
    private final long i;
    private final m j;

    public l(File file, File file2) {
        this(file, file2, null);
    }

    public l(File file, File file2, String string) {
        this(file, file2, string, null, null, 0L, 0L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public l(File file, File file2, String string, Iterable iterable, Iterable list, long l2, long l3) {
        Object object;
        Object object2;
        io.netty.c.c.i.b();
        if (file == null) {
            throw new NullPointerException("certChainFile");
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("certChainFile is not a file: " + file);
        }
        if (file2 == null) {
            throw new NullPointerException("keyPath");
        }
        if (!file2.isFile()) {
            throw new IllegalArgumentException("keyPath is not a file: " + file2);
        }
        if (iterable == null) {
            iterable = b;
        }
        if (string == null) {
            string = "";
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        Object object3 = iterable.iterator();
        while (object3.hasNext() && (object2 = (String)object3.next()) != null) {
            this.d.add(object2);
        }
        object3 = new ArrayList();
        object2 = list.iterator();
        while (object2.hasNext() && (object = (String)object2.next()) != null) {
            object3.add(object);
        }
        this.h = Collections.unmodifiableList(object3);
        this.c = Pool.create((long)0L);
        boolean bl2 = false;
        try {
            object = l.class;
            synchronized (l.class) {
                CharSequence charSequence;
                try {
                    this.i = SSLContext.make((long)this.c, (int)6, (int)1);
                }
                catch (Exception exception) {
                    throw new SSLException("failed to create an SSL_CTX", exception);
                }
                SSLContext.setOptions((long)this.i, (int)4095);
                SSLContext.setOptions((long)this.i, (int)0x1000000);
                SSLContext.setOptions((long)this.i, (int)0x400000);
                SSLContext.setOptions((long)this.i, (int)524288);
                SSLContext.setOptions((long)this.i, (int)0x100000);
                SSLContext.setOptions((long)this.i, (int)65536);
                try {
                    charSequence = new StringBuilder();
                    for (String string2 : this.d) {
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append(':');
                    }
                    ((StringBuilder)charSequence).setLength(((StringBuilder)charSequence).length() - 1);
                    SSLContext.setCipherSuite((long)this.i, (String)((StringBuilder)charSequence).toString());
                }
                catch (SSLException sSLException) {
                    throw sSLException;
                }
                catch (Exception exception) {
                    throw new SSLException("failed to set cipher suite: " + this.d, exception);
                }
                SSLContext.setVerify((long)this.i, (int)0, (int)10);
                try {
                    if (!SSLContext.setCertificate((long)this.i, (String)file.getPath(), (String)file2.getPath(), (String)string, (int)0)) {
                        throw new SSLException("failed to set certificate: " + file + " and " + file2 + " (" + SSL.getLastError() + ')');
                    }
                }
                catch (SSLException sSLException) {
                    throw sSLException;
                }
                catch (Exception exception) {
                    throw new SSLException("failed to set certificate: " + file + " and " + file2, exception);
                }
                if (!SSLContext.setCertificateChainFile((long)this.i, (String)file.getPath(), (boolean)true) && !((String)(charSequence = SSL.getLastError())).startsWith("error:00000000:")) {
                    throw new SSLException("failed to set certificate chain: " + file + " (" + SSL.getLastError() + ')');
                }
                if (!object3.isEmpty()) {
                    charSequence = new StringBuilder();
                    Iterator iterator = object3.iterator();
                    while (iterator.hasNext()) {
                        String string2;
                        string2 = (String)iterator.next();
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append(',');
                    }
                    ((StringBuilder)charSequence).setLength(((StringBuilder)charSequence).length() - 1);
                    SSLContext.setNextProtos((long)this.i, (String)((StringBuilder)charSequence).toString());
                }
                if (l2 > 0L) {
                    this.f = l2;
                    SSLContext.setSessionCacheSize((long)this.i, (long)l2);
                } else {
                    this.f = l2 = SSLContext.setSessionCacheSize((long)this.i, (long)20480L);
                    SSLContext.setSessionCacheSize((long)this.i, (long)l2);
                }
                if (l3 > 0L) {
                    this.g = l3;
                    SSLContext.setSessionCacheTimeout((long)this.i, (long)l3);
                } else {
                    this.g = l3 = SSLContext.setSessionCacheTimeout((long)this.i, (long)300L);
                    SSLContext.setSessionCacheTimeout((long)this.i, (long)l3);
                }
                // ** MonitorExit[var12_11] (shouldn't be in output)
                bl2 = true;
            }
        }
        finally {
            if (!bl2) {
                this.l();
            }
        }
        {
            this.j = new m(this.i);
            return;
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public List e() {
        return this.e;
    }

    @Override
    public long f() {
        return this.f;
    }

    @Override
    public long g() {
        return this.g;
    }

    @Override
    public List b() {
        return this.h;
    }

    public long c() {
        return this.i;
    }

    public m d() {
        return this.j;
    }

    @Override
    public SSLEngine a(h h2) {
        if (this.h.isEmpty()) {
            return new j(this.i, h2, null);
        }
        return new j(this.i, h2, (String)this.h.get(this.h.size() - 1));
    }

    @Override
    public SSLEngine a(h h2, String string, int n2) {
        throw new UnsupportedOperationException();
    }

    public void a(byte[] arrby) {
        if (arrby == null) {
            throw new NullPointerException("keys");
        }
        SSLContext.setSessionTicketKeys((long)this.i, (byte[])arrby);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() {
        super.finalize();
        Class<l> class_ = l.class;
        synchronized (l.class) {
            if (this.i != 0L) {
                SSLContext.free((long)this.i);
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            this.l();
            return;
        }
    }

    private void l() {
        if (this.c != 0L) {
            Pool.destroy((long)this.c);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, "ECDHE-RSA-AES128-GCM-SHA256", "ECDHE-RSA-RC4-SHA", "ECDHE-RSA-AES128-SHA", "ECDHE-RSA-AES256-SHA", "AES128-GCM-SHA256", "RC4-SHA", "RC4-MD5", "AES128-SHA", "AES256-SHA", "DES-CBC3-SHA");
        b = Collections.unmodifiableList(arrayList);
        if (a.d()) {
            a.b("Default cipher suite (OpenSSL): " + arrayList);
        }
    }
}

