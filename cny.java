/*
 * Decompiled with CFR 0.150.
 */
public class cny {
    public static final cny a = new dgi(0L);
    private final long b;
    private long c;

    public cny(long l2) {
        this.b = l2;
    }

    public void a(long l2) {
        this.c += l2 / 8L;
        if (this.c > this.b) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
        }
    }
}

