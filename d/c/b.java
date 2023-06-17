/*
 * Decompiled with CFR 0.150.
 */
package d.c;

import java.math.BigDecimal;

public abstract class b {
    private static final long a = 1024L;
    private static final long b = 0x100000L;
    private static final long c = 0x40000000L;
    private static final long d = 0x10000000000L;
    private static final long e = 0x4000000000000L;

    public static String a(long l2) {
        if (l2 == 1L) {
            return String.format("%d byte", l2);
        }
        if (l2 < 1024L) {
            return String.format("%d bytes", l2);
        }
        if (l2 < 0x100000L && l2 % 1024L == 0L) {
            return String.format("%.0f KB", (double)l2 / 1024.0);
        }
        if (l2 < 0x100000L) {
            return String.format("%.1f KB", (double)l2 / 1024.0);
        }
        if (l2 < 0x40000000L && l2 % 0x100000L == 0L) {
            return String.format("%.0f MB", (double)l2 / 1048576.0);
        }
        if (l2 < 0x40000000L) {
            return String.format("%.1f MB", (double)l2 / 1048576.0);
        }
        if (l2 % 0x40000000L == 0L && l2 < 0x10000000000L) {
            return String.format("%.0f GB", (double)l2 / 1.073741824E9);
        }
        if (l2 < 0x10000000000L) {
            return String.format("%.1f GB", (double)l2 / 1.073741824E9);
        }
        if (l2 % 0x10000000000L == 0L && l2 < 0x4000000000000L) {
            return String.format("%.0f TiB", (double)l2 / 1.099511627776E12);
        }
        if (l2 < 0x4000000000000L) {
            return String.format("%.1f TiB", (double)l2 / 1.099511627776E12);
        }
        return String.format("%d bytes", l2);
    }

    public static float a(float f2, int n2) {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(f2));
        bigDecimal = bigDecimal.setScale(n2, 4);
        return bigDecimal.floatValue();
    }
}

