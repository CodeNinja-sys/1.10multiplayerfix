/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.aj;
import com.a.a.i.ax;
import com.a.a.i.cl;
import com.a.a.i.r;
import com.a.a.i.z;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public abstract class p
implements cl {
    protected p() {
    }

    public aj a(Charset charset) {
        return new r(this, charset, null);
    }

    public abstract OutputStream a();

    public final OutputStream b() {
        return this.a();
    }

    public OutputStream c() {
        OutputStream outputStream = this.a();
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream)outputStream : new BufferedOutputStream(outputStream);
    }

    public void a(byte[] arrby) {
        com.a.a.b.cl.a(arrby);
        ax ax2 = ax.a();
        try {
            OutputStream outputStream = (OutputStream)ax2.a(this.a());
            outputStream.write(arrby);
            outputStream.flush();
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public long a(InputStream inputStream) {
        com.a.a.b.cl.a(inputStream);
        ax ax2 = ax.a();
        try {
            OutputStream outputStream = (OutputStream)ax2.a(this.a());
            long l2 = z.a(inputStream, outputStream);
            outputStream.flush();
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

