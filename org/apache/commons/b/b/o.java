/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.b.b.a;
import org.apache.commons.b.t;

public class o
extends a
implements Serializable {
    private static final long a = -547733176983104172L;
    private final byte[] b;
    private final long c;

    public o(byte[] arrby) {
        this(arrby, 0L);
    }

    public o(String string) {
        this(string, 0L);
    }

    public o(String string, long l2) {
        if (string == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (string.length() == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.b = string.getBytes();
        this.c = l2;
    }

    public o(byte[] arrby, long l2) {
        if (arrby == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (arrby.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.b = new byte[arrby.length];
        System.arraycopy(arrby, 0, this.b, 0, arrby.length);
        this.c = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public boolean accept(File file) {
        boolean bl2;
        byte[] arrby;
        RandomAccessFile randomAccessFile;
        block5: {
            if (file == null) return false;
            if (!file.isFile()) return false;
            if (!file.canRead()) return false;
            randomAccessFile = null;
            arrby = new byte[this.b.length];
            randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.seek(this.c);
            int n2 = randomAccessFile.read(arrby);
            if (n2 == this.b.length) break block5;
            boolean bl3 = false;
            t.a(randomAccessFile);
            return bl3;
        }
        try {
            bl2 = Arrays.equals(this.b, arrby);
        }
        catch (IOException iOException) {
            t.a(randomAccessFile);
            return false;
            catch (Throwable throwable) {
                t.a(randomAccessFile);
                throw throwable;
            }
        }
        t.a(randomAccessFile);
        return bl2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("(");
        stringBuilder.append(new String(this.b));
        stringBuilder.append(",");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

