/*
 * Decompiled with CFR 0.150.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bix {
    private static final d a = org.apache.logging.log4j.c.c();
    private ByteBuffer b;
    private IntBuffer c;
    private ShortBuffer d;
    private FloatBuffer e;
    private int f;
    private ctq g;
    private int h;
    private boolean i;
    private int j;
    private double k;
    private double l;
    private double m;
    private ava n;
    private boolean o;

    public bix(int n2) {
        this.b = avj.c(n2 * 4);
        this.c = this.b.asIntBuffer();
        this.d = this.b.asShortBuffer();
        this.e = this.b.asFloatBuffer();
    }

    private void b(int n2) {
        if (cmk.c(n2, 4) / 4 <= this.c.remaining() && this.f * this.n.g() + n2 <= this.b.capacity()) {
            return;
        }
        int n3 = this.b.capacity();
        int n4 = n3 + cmk.c(n2, 0x200000);
        a.a("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", n3, n4);
        int n5 = this.c.position();
        ByteBuffer byteBuffer = avj.c(n4);
        this.b.position(0);
        byteBuffer.put(this.b);
        byteBuffer.rewind();
        this.b = byteBuffer;
        this.e = this.b.asFloatBuffer().asReadOnlyBuffer();
        this.c = this.b.asIntBuffer();
        this.c.position(n5);
        this.d = this.b.asShortBuffer();
        this.d.position(n5 << 1);
    }

    public void a(float f2, float f3, float f4) {
        int n2 = this.f / 4;
        float[] arrf = new float[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrf[i2] = bix.a(this.e, (float)((double)f2 + this.k), (float)((double)f3 + this.l), (float)((double)f4 + this.m), this.n.f(), i2 * this.n.g());
        }
        Integer[] arrinteger = new Integer[n2];
        for (int i3 = 0; i3 < arrinteger.length; ++i3) {
            arrinteger[i3] = i3;
        }
        Arrays.sort(arrinteger, new ahl(this, arrf));
        BitSet bitSet = new BitSet();
        int n3 = this.n.g();
        int[] arrn = new int[n3];
        int n4 = bitSet.nextClearBit(0);
        while (n4 < arrinteger.length) {
            int n5 = arrinteger[n4];
            if (n5 != n4) {
                this.c.limit(n5 * n3 + n3);
                this.c.position(n5 * n3);
                this.c.get(arrn);
                int n6 = n5;
                int n7 = arrinteger[n6];
                while (n6 != n4) {
                    this.c.limit(n7 * n3 + n3);
                    this.c.position(n7 * n3);
                    IntBuffer intBuffer = this.c.slice();
                    this.c.limit(n6 * n3 + n3);
                    this.c.position(n6 * n3);
                    this.c.put(intBuffer);
                    bitSet.set(n6);
                    n6 = n7;
                    n7 = arrinteger[n6];
                }
                this.c.limit(n4 * n3 + n3);
                this.c.position(n4 * n3);
                this.c.put(arrn);
            }
            bitSet.set(n4);
            n4 = bitSet.nextClearBit(n4 + 1);
        }
    }

    public bok a() {
        this.c.rewind();
        int n2 = this.j();
        this.c.limit(n2);
        int[] arrn = new int[n2];
        this.c.get(arrn);
        this.c.limit(this.c.capacity());
        this.c.position(n2);
        return new bok(this, arrn, new ava(this.n));
    }

    private int j() {
        return this.f * this.n.f();
    }

    private static float a(FloatBuffer floatBuffer, float f2, float f3, float f4, int n2, int n3) {
        float f5 = floatBuffer.get(n3 + n2 * 0 + 0);
        float f6 = floatBuffer.get(n3 + n2 * 0 + 1);
        float f7 = floatBuffer.get(n3 + n2 * 0 + 2);
        float f8 = floatBuffer.get(n3 + n2 * 1 + 0);
        float f9 = floatBuffer.get(n3 + n2 * 1 + 1);
        float f10 = floatBuffer.get(n3 + n2 * 1 + 2);
        float f11 = floatBuffer.get(n3 + n2 * 2 + 0);
        float f12 = floatBuffer.get(n3 + n2 * 2 + 1);
        float f13 = floatBuffer.get(n3 + n2 * 2 + 2);
        float f14 = floatBuffer.get(n3 + n2 * 3 + 0);
        float f15 = floatBuffer.get(n3 + n2 * 3 + 1);
        float f16 = floatBuffer.get(n3 + n2 * 3 + 2);
        float f17 = (f5 + f8 + f11 + f14) * 0.25f - f2;
        float f18 = (f6 + f9 + f12 + f15) * 0.25f - f3;
        float f19 = (f7 + f10 + f13 + f16) * 0.25f - f4;
        return f17 * f17 + f18 * f18 + f19 * f19;
    }

    public void a(bok bok2) {
        this.c.clear();
        this.b(bok2.a().length * 4);
        this.c.put(bok2.a());
        this.f = bok2.b();
        this.n = new ava(bok2.c());
    }

    public void b() {
        this.f = 0;
        this.g = null;
        this.h = 0;
    }

    public void a(int n2, ava ava2) {
        if (this.o) {
            throw new IllegalStateException("Already building!");
        }
        this.o = true;
        this.b();
        this.j = n2;
        this.n = ava2;
        this.g = ava2.c(this.h);
        this.i = false;
        this.b.limit(this.b.capacity());
    }

    public bix a(double d2, double d3) {
        int n2 = this.f * this.n.g() + this.n.d(this.h);
        switch (this.g.a()) {
            case a: {
                this.b.putFloat(n2, (float)d2);
                this.b.putFloat(n2 + 4, (float)d3);
                break;
            }
            case f: 
            case g: {
                this.b.putInt(n2, (int)d2);
                this.b.putInt(n2 + 4, (int)d3);
                break;
            }
            case d: 
            case e: {
                this.b.putShort(n2, (short)d3);
                this.b.putShort(n2 + 2, (short)d2);
                break;
            }
            case b: 
            case c: {
                this.b.put(n2, (byte)d3);
                this.b.put(n2 + 1, (byte)d2);
            }
        }
        this.k();
        return this;
    }

    public bix a(int n2, int n3) {
        int n4 = this.f * this.n.g() + this.n.d(this.h);
        switch (this.g.a()) {
            case a: {
                this.b.putFloat(n4, n2);
                this.b.putFloat(n4 + 4, n3);
                break;
            }
            case f: 
            case g: {
                this.b.putInt(n4, n2);
                this.b.putInt(n4 + 4, n3);
                break;
            }
            case d: 
            case e: {
                this.b.putShort(n4, (short)n3);
                this.b.putShort(n4 + 2, (short)n2);
                break;
            }
            case b: 
            case c: {
                this.b.put(n4, (byte)n3);
                this.b.put(n4 + 1, (byte)n2);
            }
        }
        this.k();
        return this;
    }

    public void a(int n2, int n3, int n4, int n5) {
        int n6 = (this.f - 4) * this.n.f() + this.n.b(1) / 4;
        int n7 = this.n.g() >> 2;
        this.c.put(n6, n2);
        this.c.put(n6 + n7, n3);
        this.c.put(n6 + n7 * 2, n4);
        this.c.put(n6 + n7 * 3, n5);
    }

    public void a(double d2, double d3, double d4) {
        int n2 = this.n.f();
        int n3 = (this.f - 4) * n2;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4 = n3 + i2 * n2;
            int n5 = n4 + 1;
            int n6 = n5 + 1;
            this.c.put(n4, Float.floatToRawIntBits((float)(d2 + this.k) + Float.intBitsToFloat(this.c.get(n4))));
            this.c.put(n5, Float.floatToRawIntBits((float)(d3 + this.l) + Float.intBitsToFloat(this.c.get(n5))));
            this.c.put(n6, Float.floatToRawIntBits((float)(d4 + this.m) + Float.intBitsToFloat(this.c.get(n6))));
        }
    }

    private int c(int n2) {
        return ((this.f - n2) * this.n.g() + this.n.e()) / 4;
    }

    public void a(float f2, float f3, float f4, int n2) {
        int n3 = this.c(n2);
        int n4 = -1;
        if (!this.i) {
            n4 = this.c.get(n3);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                int n5 = (int)((float)(n4 & 0xFF) * f2);
                int n6 = (int)((float)(n4 >> 8 & 0xFF) * f3);
                int n7 = (int)((float)(n4 >> 16 & 0xFF) * f4);
                n4 &= 0xFF000000;
                n4 |= n7 << 16 | n6 << 8 | n5;
            } else {
                int n8 = (int)((float)(n4 >> 24 & 0xFF) * f2);
                int n9 = (int)((float)(n4 >> 16 & 0xFF) * f3);
                int n10 = (int)((float)(n4 >> 8 & 0xFF) * f4);
                n4 &= 0xFF;
                n4 |= n8 << 24 | n9 << 16 | n10 << 8;
            }
        }
        this.c.put(n3, n4);
    }

    private void b(int n2, int n3) {
        int n4 = this.c(n3);
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n2 >> 24 & 0xFF;
        this.a(n4, n5, n6, n7, n8);
    }

    public void b(float f2, float f3, float f4, int n2) {
        int n3 = this.c(n2);
        int n4 = cmk.a((int)(f2 * 255.0f), 0, 255);
        int n5 = cmk.a((int)(f3 * 255.0f), 0, 255);
        int n6 = cmk.a((int)(f4 * 255.0f), 0, 255);
        this.a(n3, n4, n5, n6, 255);
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.c.put(n2, n6 << 24 | n5 << 16 | n4 << 8 | n3);
        } else {
            this.c.put(n2, n3 << 24 | n4 << 16 | n5 << 8 | n6);
        }
    }

    public void c() {
        this.i = true;
    }

    public bix a(float f2, float f3, float f4, float f5) {
        return this.b((int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f), (int)(f5 * 255.0f));
    }

    public bix b(int n2, int n3, int n4, int n5) {
        if (this.i) {
            return this;
        }
        int n6 = this.f * this.n.g() + this.n.d(this.h);
        switch (this.g.a()) {
            case a: {
                this.b.putFloat(n6, (float)n2 / 255.0f);
                this.b.putFloat(n6 + 4, (float)n3 / 255.0f);
                this.b.putFloat(n6 + 8, (float)n4 / 255.0f);
                this.b.putFloat(n6 + 12, (float)n5 / 255.0f);
                break;
            }
            case f: 
            case g: {
                this.b.putFloat(n6, n2);
                this.b.putFloat(n6 + 4, n3);
                this.b.putFloat(n6 + 8, n4);
                this.b.putFloat(n6 + 12, n5);
                break;
            }
            case d: 
            case e: {
                this.b.putShort(n6, (short)n2);
                this.b.putShort(n6 + 2, (short)n3);
                this.b.putShort(n6 + 4, (short)n4);
                this.b.putShort(n6 + 6, (short)n5);
                break;
            }
            case b: 
            case c: {
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    this.b.put(n6, (byte)n2);
                    this.b.put(n6 + 1, (byte)n3);
                    this.b.put(n6 + 2, (byte)n4);
                    this.b.put(n6 + 3, (byte)n5);
                    break;
                }
                this.b.put(n6, (byte)n5);
                this.b.put(n6 + 1, (byte)n4);
                this.b.put(n6 + 2, (byte)n3);
                this.b.put(n6 + 3, (byte)n2);
            }
        }
        this.k();
        return this;
    }

    public void a(int[] arrn) {
        this.b(arrn.length * 4);
        this.c.position(this.j());
        this.c.put(arrn);
        this.f += arrn.length / this.n.f();
    }

    public void d() {
        ++this.f;
        this.b(this.n.g());
    }

    public bix b(double d2, double d3, double d4) {
        int n2 = this.f * this.n.g() + this.n.d(this.h);
        switch (this.g.a()) {
            case a: {
                this.b.putFloat(n2, (float)(d2 + this.k));
                this.b.putFloat(n2 + 4, (float)(d3 + this.l));
                this.b.putFloat(n2 + 8, (float)(d4 + this.m));
                break;
            }
            case f: 
            case g: {
                this.b.putInt(n2, Float.floatToRawIntBits((float)(d2 + this.k)));
                this.b.putInt(n2 + 4, Float.floatToRawIntBits((float)(d3 + this.l)));
                this.b.putInt(n2 + 8, Float.floatToRawIntBits((float)(d4 + this.m)));
                break;
            }
            case d: 
            case e: {
                this.b.putShort(n2, (short)(d2 + this.k));
                this.b.putShort(n2 + 2, (short)(d3 + this.l));
                this.b.putShort(n2 + 4, (short)(d4 + this.m));
                break;
            }
            case b: 
            case c: {
                this.b.put(n2, (byte)(d2 + this.k));
                this.b.put(n2 + 1, (byte)(d3 + this.l));
                this.b.put(n2 + 2, (byte)(d4 + this.m));
            }
        }
        this.k();
        return this;
    }

    public void b(float f2, float f3, float f4) {
        int n2 = (byte)(f2 * 127.0f) & 0xFF;
        int n3 = (byte)(f3 * 127.0f) & 0xFF;
        int n4 = (byte)(f4 * 127.0f) & 0xFF;
        int n5 = n2 | n3 << 8 | n4 << 16;
        int n6 = this.n.g() >> 2;
        int n7 = (this.f - 4) * n6 + this.n.c() / 4;
        this.c.put(n7, n5);
        this.c.put(n7 + n6, n5);
        this.c.put(n7 + n6 * 2, n5);
        this.c.put(n7 + n6 * 3, n5);
    }

    private void k() {
        ++this.h;
        this.h %= this.n.i();
        this.g = this.n.c(this.h);
        if (this.g.b() == ui.g) {
            this.k();
        }
    }

    public bix c(float f2, float f3, float f4) {
        int n2 = this.f * this.n.g() + this.n.d(this.h);
        switch (this.g.a()) {
            case a: {
                this.b.putFloat(n2, f2);
                this.b.putFloat(n2 + 4, f3);
                this.b.putFloat(n2 + 8, f4);
                break;
            }
            case f: 
            case g: {
                this.b.putInt(n2, (int)f2);
                this.b.putInt(n2 + 4, (int)f3);
                this.b.putInt(n2 + 8, (int)f4);
                break;
            }
            case d: 
            case e: {
                this.b.putShort(n2, (short)((int)f2 * 32767 & 0xFFFF));
                this.b.putShort(n2 + 2, (short)((int)f3 * 32767 & 0xFFFF));
                this.b.putShort(n2 + 4, (short)((int)f4 * 32767 & 0xFFFF));
                break;
            }
            case b: 
            case c: {
                this.b.put(n2, (byte)((int)f2 * 127 & 0xFF));
                this.b.put(n2 + 1, (byte)((int)f3 * 127 & 0xFF));
                this.b.put(n2 + 2, (byte)((int)f4 * 127 & 0xFF));
            }
        }
        this.k();
        return this;
    }

    public void c(double d2, double d3, double d4) {
        this.k = d2;
        this.l = d3;
        this.m = d4;
    }

    public void e() {
        if (!this.o) {
            throw new IllegalStateException("Not building!");
        }
        this.o = false;
        this.b.position(0);
        this.b.limit(this.j() * 4);
    }

    public ByteBuffer f() {
        return this.b;
    }

    public ava g() {
        return this.n;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.j;
    }

    public void a(int n2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b(n2, i2 + 1);
        }
    }

    public void d(float f2, float f3, float f4) {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b(f2, f3, f4, i2 + 1);
        }
    }
}

