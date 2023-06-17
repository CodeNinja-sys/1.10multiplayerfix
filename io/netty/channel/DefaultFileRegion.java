/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.cv;
import io.netty.util.a;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class DefaultFileRegion
extends a
implements cv {
    private static final g a = h.a(DefaultFileRegion.class);
    private final FileChannel b;
    private final long c;
    private final long d;
    private long e;

    public DefaultFileRegion(FileChannel fileChannel, long l2, long l3) {
        if (fileChannel == null) {
            throw new NullPointerException("file");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException("position must be >= 0 but was " + l2);
        }
        if (l3 < 0L) {
            throw new IllegalArgumentException("count must be >= 0 but was " + l3);
        }
        this.b = fileChannel;
        this.c = l2;
        this.d = l3;
    }

    @Override
    public long a() {
        return this.c;
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public long c() {
        return this.e;
    }

    @Override
    public long a(WritableByteChannel writableByteChannel, long l2) {
        long l3 = this.d - l2;
        if (l3 < 0L || l2 < 0L) {
            throw new IllegalArgumentException("position out of range: " + l2 + " (expected: 0 - " + (this.d - 1L) + ')');
        }
        if (l3 == 0L) {
            return 0L;
        }
        long l4 = this.b.transferTo(this.c + l2, l3, writableByteChannel);
        if (l4 > 0L) {
            this.e += l4;
        }
        return l4;
    }

    @Override
    protected void d() {
        block2: {
            try {
                this.b.close();
            }
            catch (IOException iOException) {
                if (!a.f()) break block2;
                a.d("Failed to close a file.", iOException);
            }
        }
    }
}

