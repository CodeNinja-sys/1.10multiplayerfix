/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.Native;
import com.sun.jna.at;
import com.sun.jna.au;
import com.sun.jna.av;
import com.sun.jna.ax;
import com.sun.jna.ba;
import com.sun.jna.bd;
import com.sun.jna.bs;
import com.sun.jna.bw;
import com.sun.jna.e;
import com.sun.jna.m;
import com.sun.jna.n;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class ay {
    public static final int H = Native.a;
    public static final ay I;
    protected long J;
    static Class K;
    static Class L;
    static Class M;
    static Class N;
    static Class O;
    static Class P;
    static Class Q;
    static Class R;
    static Class S;
    static Class T;
    static Class U;
    static Class V;
    static Class W;
    static Class X;
    static Class Y;
    static Class Z;

    public static final ay l(long l2) {
        return new ba(l2, null);
    }

    public static final ay b(int n2) {
        return new ba((long)n2 & 0xFFFFFFFFFFFFFFFFL, null);
    }

    ay() {
    }

    public ay(long l2) {
        this.J = l2;
    }

    public ay a(long l2) {
        return this.a(l2, 0L);
    }

    public ay a(long l2, long l3) {
        if (l2 == 0L) {
            return this;
        }
        return new ay(this.J + l2);
    }

    public void m(long l2) {
        this.a(0L, l2, (byte)0);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        return object instanceof ay && ((ay)object).J == this.J;
    }

    public int hashCode() {
        return (int)((this.J >>> 32) + (this.J & 0xFFFFFFFFFFFFFFFFL));
    }

    public long b(long l2, byte by2) {
        return Native.indexOf(this.J + l2, by2);
    }

    public void a(long l2, byte[] arrby, int n2, int n3) {
        Native.read(this.J + l2, arrby, n2, n3);
    }

    public void a(long l2, short[] arrs, int n2, int n3) {
        Native.read(this.J + l2, arrs, n2, n3);
    }

    public void a(long l2, char[] arrc, int n2, int n3) {
        Native.read(this.J + l2, arrc, n2, n3);
    }

    public void a(long l2, int[] arrn, int n2, int n3) {
        Native.read(this.J + l2, arrn, n2, n3);
    }

    public void a(long l2, long[] arrl, int n2, int n3) {
        Native.read(this.J + l2, arrl, n2, n3);
    }

    public void a(long l2, float[] arrf, int n2, int n3) {
        Native.read(this.J + l2, arrf, n2, n3);
    }

    public void a(long l2, double[] arrd, int n2, int n3) {
        Native.read(this.J + l2, arrd, n2, n3);
    }

    public void a(long l2, ay[] array, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            ay ay2 = this.i(l2 + (long)(i2 * H));
            ay ay3 = array[i2 + n2];
            if (ay3 != null && ay2 != null && ay2.J == ay3.J) continue;
            array[i2 + n2] = ay2;
        }
    }

    public void b(long l2, byte[] arrby, int n2, int n3) {
        Native.write(this.J + l2, arrby, n2, n3);
    }

    public void b(long l2, short[] arrs, int n2, int n3) {
        Native.write(this.J + l2, arrs, n2, n3);
    }

    public void b(long l2, char[] arrc, int n2, int n3) {
        Native.write(this.J + l2, arrc, n2, n3);
    }

    public void b(long l2, int[] arrn, int n2, int n3) {
        Native.write(this.J + l2, arrn, n2, n3);
    }

    public void b(long l2, long[] arrl, int n2, int n3) {
        Native.write(this.J + l2, arrl, n2, n3);
    }

    public void b(long l2, float[] arrf, int n2, int n3) {
        Native.write(this.J + l2, arrf, n2, n3);
    }

    public void b(long l2, double[] arrd, int n2, int n3) {
        Native.write(this.J + l2, arrd, n2, n3);
    }

    public void b(long l2, ay[] array, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(l2 + (long)(i2 * H), array[n2 + i2]);
        }
    }

    Object a(long l2, Class class_, Object object) {
        Object object2 = null;
        if ((K == null ? (K = ay.b("com.sun.jna.bd")) : K).isAssignableFrom(class_)) {
            bd bd2 = (bd)object;
            if ((L == null ? (L = ay.b("com.sun.jna.bi")) : L).isAssignableFrom(class_)) {
                bd2 = bd.a(class_, bd2, this.i(l2));
            } else {
                bd2.a(this, (int)l2);
                bd2.j();
            }
            object2 = bd2;
        } else if (class_ == Boolean.TYPE || class_ == (M == null ? (M = ay.b("java.lang.Boolean")) : M)) {
            object2 = n.a(this.e(l2) != 0);
        } else if (class_ == Byte.TYPE || class_ == (N == null ? (N = ay.b("java.lang.Byte")) : N)) {
            object2 = new Byte(this.b(l2));
        } else if (class_ == Short.TYPE || class_ == (O == null ? (O = ay.b("java.lang.Short")) : O)) {
            object2 = new Short(this.d(l2));
        } else if (class_ == Character.TYPE || class_ == (P == null ? (P = ay.b("java.lang.Character")) : P)) {
            object2 = new Character(this.c(l2));
        } else if (class_ == Integer.TYPE || class_ == (Q == null ? (Q = ay.b("java.lang.Integer")) : Q)) {
            object2 = new Integer(this.e(l2));
        } else if (class_ == Long.TYPE || class_ == (R == null ? (R = ay.b("java.lang.Long")) : R)) {
            object2 = new Long(this.f(l2));
        } else if (class_ == Float.TYPE || class_ == (S == null ? (S = ay.b("java.lang.Float")) : S)) {
            object2 = new Float(this.g(l2));
        } else if (class_ == Double.TYPE || class_ == (T == null ? (T = ay.b("java.lang.Double")) : T)) {
            object2 = new Double(this.h(l2));
        } else if ((U == null ? (U = ay.b("com.sun.jna.ay")) : U).isAssignableFrom(class_)) {
            ay ay2 = this.i(l2);
            if (ay2 != null) {
                ay ay3;
                ay ay4 = ay3 = object instanceof ay ? (ay)object : null;
                object2 = ay3 == null || ay2.J != ay3.J ? ay2 : ay3;
            }
        } else if (class_ == (V == null ? (V = ay.b("java.lang.String")) : V)) {
            ay ay5 = this.i(l2);
            object2 = ay5 != null ? ay5.o(0L) : null;
        } else if (class_ == (W == null ? (W = ay.b("com.sun.jna.bw")) : W)) {
            ay ay6 = this.i(l2);
            object2 = ay6 != null ? new bw(ay6.a(0L, true)) : null;
        } else if ((X == null ? (X = ay.b("com.sun.jna.Callback")) : X).isAssignableFrom(class_)) {
            ay ay7 = this.i(l2);
            if (ay7 == null) {
                object2 = null;
            } else {
                Callback callback = (Callback)object;
                ay ay8 = e.a(callback);
                if (!ay7.equals(ay8)) {
                    callback = e.a(class_, ay7);
                }
                object2 = callback;
            }
        } else if (ax.j && (Y == null ? (Y = ay.b("java.nio.Buffer")) : Y).isAssignableFrom(class_)) {
            ay ay9 = this.i(l2);
            if (ay9 == null) {
                object2 = null;
            } else {
                ay ay10;
                ay ay11 = ay10 = object == null ? null : Native.a((Buffer)object);
                if (ay10 == null || !ay10.equals(ay9)) {
                    throw new IllegalStateException("Can't autogenerate a direct buffer on memory read");
                }
                object2 = object;
            }
        } else if ((Z == null ? (Z = ay.b("com.sun.jna.au")) : Z).isAssignableFrom(class_)) {
            au au2 = (au)object;
            if (au2 != null) {
                Object object3 = this.a(l2, au2.b(), (Object)null);
                object2 = au2.a(object3, new m(class_));
            } else {
                av av2 = av.a(class_);
                Object object4 = this.a(l2, av2.a(), (Object)null);
                object2 = av2.a(object4, new m(class_));
            }
        } else if (class_.isArray()) {
            object2 = object;
            if (object2 == null) {
                throw new IllegalStateException("Need an initialized array");
            }
            this.b(l2, object2, class_.getComponentType());
        } else {
            throw new IllegalArgumentException("Reading \"" + class_ + "\" from memory is not supported");
        }
        return object2;
    }

    private void b(long l2, Object object, Class class_) {
        int n2 = 0;
        n2 = Array.getLength(object);
        Object object2 = object;
        if (class_ == Byte.TYPE) {
            this.a(l2, (byte[])object2, 0, n2);
        } else if (class_ == Short.TYPE) {
            this.a(l2, (short[])object2, 0, n2);
        } else if (class_ == Character.TYPE) {
            this.a(l2, (char[])object2, 0, n2);
        } else if (class_ == Integer.TYPE) {
            this.a(l2, (int[])object2, 0, n2);
        } else if (class_ == Long.TYPE) {
            this.a(l2, (long[])object2, 0, n2);
        } else if (class_ == Float.TYPE) {
            this.a(l2, (float[])object2, 0, n2);
        } else if (class_ == Double.TYPE) {
            this.a(l2, (double[])object2, 0, n2);
        } else if ((U == null ? (U = ay.b("com.sun.jna.ay")) : U).isAssignableFrom(class_)) {
            this.a(l2, (ay[])object2, 0, n2);
        } else if ((K == null ? (K = ay.b("com.sun.jna.bd")) : K).isAssignableFrom(class_)) {
            bd[] arrbd = (bd[])object2;
            if ((L == null ? (L = ay.b("com.sun.jna.bi")) : L).isAssignableFrom(class_)) {
                ay[] array = this.i(l2, arrbd.length);
                for (int i2 = 0; i2 < arrbd.length; ++i2) {
                    arrbd[i2] = bd.a(class_, arrbd[i2], array[i2]);
                }
            } else {
                for (int i3 = 0; i3 < arrbd.length; ++i3) {
                    if (arrbd[i3] == null) {
                        arrbd[i3] = bd.a(class_);
                    }
                    arrbd[i3].a(this, (int)(l2 + (long)(i3 * arrbd[i3].e())));
                    arrbd[i3].j();
                }
            }
        } else if ((Z == null ? (Z = ay.b("com.sun.jna.au")) : Z).isAssignableFrom(class_)) {
            au[] arrau = (au[])object2;
            av av2 = av.a(class_);
            int n3 = Native.a(object2.getClass(), object2) / arrau.length;
            for (int i4 = 0; i4 < arrau.length; ++i4) {
                Object object3 = this.a(l2 + (long)(n3 * i4), av2.a(), arrau[i4]);
                arrau[i4] = (au)av2.a(object3, new m(class_));
            }
        } else {
            throw new IllegalArgumentException("Reading array of " + class_ + " from memory not supported");
        }
    }

    public byte b(long l2) {
        return Native.getByte(this.J + l2);
    }

    public char c(long l2) {
        return Native.getChar(this.J + l2);
    }

    public short d(long l2) {
        return Native.getShort(this.J + l2);
    }

    public int e(long l2) {
        return Native.getInt(this.J + l2);
    }

    public long f(long l2) {
        return Native.getLong(this.J + l2);
    }

    public at n(long l2) {
        return new at(at.a == 8 ? this.f(l2) : (long)this.e(l2));
    }

    public float g(long l2) {
        return Native.getFloat(this.J + l2);
    }

    public double h(long l2) {
        return Native.getDouble(this.J + l2);
    }

    public ay i(long l2) {
        return Native.a(this.J + l2);
    }

    public ByteBuffer c(long l2, long l3) {
        return Native.getDirectByteBuffer(this.J + l2, l3).order(ByteOrder.nativeOrder());
    }

    public String a(long l2, boolean bl2) {
        return Native.getString(this.J + l2, bl2);
    }

    public String o(long l2) {
        long l3;
        String string = System.getProperty("jna.encoding");
        if (string != null && (l3 = this.b(l2, (byte)0)) != -1L) {
            if (l3 > Integer.MAX_VALUE) {
                throw new OutOfMemoryError("String exceeds maximum length: " + l3);
            }
            byte[] arrby = this.b(l2, (int)l3);
            try {
                return new String(arrby, string);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                // empty catch block
            }
        }
        return this.a(l2, false);
    }

    public byte[] b(long l2, int n2) {
        byte[] arrby = new byte[n2];
        this.a(l2, arrby, 0, n2);
        return arrby;
    }

    public char[] c(long l2, int n2) {
        char[] arrc = new char[n2];
        this.a(l2, arrc, 0, n2);
        return arrc;
    }

    public short[] d(long l2, int n2) {
        short[] arrs = new short[n2];
        this.a(l2, arrs, 0, n2);
        return arrs;
    }

    public int[] e(long l2, int n2) {
        int[] arrn = new int[n2];
        this.a(l2, arrn, 0, n2);
        return arrn;
    }

    public long[] f(long l2, int n2) {
        long[] arrl = new long[n2];
        this.a(l2, arrl, 0, n2);
        return arrl;
    }

    public float[] g(long l2, int n2) {
        float[] arrf = new float[n2];
        this.a(l2, arrf, 0, n2);
        return arrf;
    }

    public double[] h(long l2, int n2) {
        double[] arrd = new double[n2];
        this.a(l2, arrd, 0, n2);
        return arrd;
    }

    public ay[] p(long l2) {
        ArrayList<ay> arrayList = new ArrayList<ay>();
        int n2 = 0;
        ay ay2 = this.i(l2);
        while (ay2 != null) {
            arrayList.add(ay2);
            ay2 = this.i(l2 + (long)(n2 += H));
        }
        return arrayList.toArray(new ay[arrayList.size()]);
    }

    public ay[] i(long l2, int n2) {
        ay[] array = new ay[n2];
        this.a(l2, array, 0, n2);
        return array;
    }

    public String[] q(long l2) {
        return this.a(l2, -1, false);
    }

    public String[] j(long l2, int n2) {
        return this.a(l2, n2, false);
    }

    public String[] b(long l2, boolean bl2) {
        return this.a(l2, -1, bl2);
    }

    public String[] a(long l2, int n2, boolean bl2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = 0;
        if (n2 != -1) {
            ay ay2 = this.i(l2 + (long)n3);
            int n4 = 0;
            while (n4++ < n2) {
                String string = ay2 == null ? null : ay2.a(0L, bl2);
                arrayList.add(string);
                if (n4 >= n2) continue;
                ay2 = this.i(l2 + (long)(n3 += H));
            }
        } else {
            ay ay3;
            while ((ay3 = this.i(l2 + (long)n3)) != null) {
                String string = ay3 == null ? null : ay3.a(0L, bl2);
                arrayList.add(string);
                n3 += H;
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    void a(long l2, Object object, Class class_) {
        if (class_ == Boolean.TYPE || class_ == (M == null ? (M = ay.b("java.lang.Boolean")) : M)) {
            this.a(l2, Boolean.TRUE.equals(object) ? -1 : 0);
        } else if (class_ == Byte.TYPE || class_ == (N == null ? (N = ay.b("java.lang.Byte")) : N)) {
            this.a(l2, object == null ? (byte)0 : (Byte)object);
        } else if (class_ == Short.TYPE || class_ == (O == null ? (O = ay.b("java.lang.Short")) : O)) {
            this.a(l2, object == null ? (short)0 : (Short)object);
        } else if (class_ == Character.TYPE || class_ == (P == null ? (P = ay.b("java.lang.Character")) : P)) {
            this.a(l2, object == null ? (char)'\u0000' : ((Character)object).charValue());
        } else if (class_ == Integer.TYPE || class_ == (Q == null ? (Q = ay.b("java.lang.Integer")) : Q)) {
            this.a(l2, object == null ? 0 : (Integer)object);
        } else if (class_ == Long.TYPE || class_ == (R == null ? (R = ay.b("java.lang.Long")) : R)) {
            this.d(l2, object == null ? 0L : (Long)object);
        } else if (class_ == Float.TYPE || class_ == (S == null ? (S = ay.b("java.lang.Float")) : S)) {
            this.a(l2, object == null ? 0.0f : ((Float)object).floatValue());
        } else if (class_ == Double.TYPE || class_ == (T == null ? (T = ay.b("java.lang.Double")) : T)) {
            this.a(l2, object == null ? 0.0 : (Double)object);
        } else if (class_ == (U == null ? (U = ay.b("com.sun.jna.ay")) : U)) {
            this.a(l2, (ay)object);
        } else if (class_ == (V == null ? (V = ay.b("java.lang.String")) : V)) {
            this.a(l2, (ay)object);
        } else if (class_ == (W == null ? (W = ay.b("com.sun.jna.bw")) : W)) {
            this.a(l2, (ay)object);
        } else if ((K == null ? (K = ay.b("com.sun.jna.bd")) : K).isAssignableFrom(class_)) {
            bd bd2 = (bd)object;
            if ((L == null ? (L = ay.b("com.sun.jna.bi")) : L).isAssignableFrom(class_)) {
                this.a(l2, bd2 == null ? null : bd2.g());
                if (bd2 != null) {
                    bd2.r();
                }
            } else {
                bd2.a(this, (int)l2);
                bd2.k();
            }
        } else if ((X == null ? (X = ay.b("com.sun.jna.Callback")) : X).isAssignableFrom(class_)) {
            this.a(l2, e.a((Callback)object));
        } else if (ax.j && (Y == null ? (Y = ay.b("java.nio.Buffer")) : Y).isAssignableFrom(class_)) {
            ay ay2 = object == null ? null : Native.a((Buffer)object);
            this.a(l2, ay2);
        } else if ((Z == null ? (Z = ay.b("com.sun.jna.au")) : Z).isAssignableFrom(class_)) {
            av av2 = av.a(class_);
            Class class_2 = av2.a();
            this.a(l2, av2.a(object, new bs()), class_2);
        } else if (class_.isArray()) {
            this.c(l2, object, class_.getComponentType());
        } else {
            throw new IllegalArgumentException("Writing " + class_ + " to memory is not supported");
        }
    }

    private void c(long l2, Object object, Class class_) {
        if (class_ == Byte.TYPE) {
            byte[] arrby = (byte[])object;
            this.b(l2, arrby, 0, arrby.length);
        } else if (class_ == Short.TYPE) {
            short[] arrs = (short[])object;
            this.b(l2, arrs, 0, arrs.length);
        } else if (class_ == Character.TYPE) {
            char[] arrc = (char[])object;
            this.b(l2, arrc, 0, arrc.length);
        } else if (class_ == Integer.TYPE) {
            int[] arrn = (int[])object;
            this.b(l2, arrn, 0, arrn.length);
        } else if (class_ == Long.TYPE) {
            long[] arrl = (long[])object;
            this.b(l2, arrl, 0, arrl.length);
        } else if (class_ == Float.TYPE) {
            float[] arrf = (float[])object;
            this.b(l2, arrf, 0, arrf.length);
        } else if (class_ == Double.TYPE) {
            double[] arrd = (double[])object;
            this.b(l2, arrd, 0, arrd.length);
        } else if ((U == null ? (U = ay.b("com.sun.jna.ay")) : U).isAssignableFrom(class_)) {
            ay[] array = (ay[])object;
            this.b(l2, array, 0, array.length);
        } else if ((K == null ? (K = ay.b("com.sun.jna.bd")) : K).isAssignableFrom(class_)) {
            bd[] arrbd = (bd[])object;
            if ((L == null ? (L = ay.b("com.sun.jna.bi")) : L).isAssignableFrom(class_)) {
                ay[] array = new ay[arrbd.length];
                for (int i2 = 0; i2 < arrbd.length; ++i2) {
                    if (arrbd[i2] == null) {
                        array[i2] = null;
                        continue;
                    }
                    array[i2] = arrbd[i2].g();
                    arrbd[i2].k();
                }
                this.b(l2, array, 0, array.length);
            } else {
                for (int i3 = 0; i3 < arrbd.length; ++i3) {
                    if (arrbd[i3] == null) {
                        arrbd[i3] = bd.a(class_);
                    }
                    arrbd[i3].a(this, (int)(l2 + (long)(i3 * arrbd[i3].e())));
                    arrbd[i3].k();
                }
            }
        } else if ((Z == null ? (Z = ay.b("com.sun.jna.au")) : Z).isAssignableFrom(class_)) {
            au[] arrau = (au[])object;
            av av2 = av.a(class_);
            Class class_2 = av2.a();
            int n2 = Native.a(object.getClass(), object) / arrau.length;
            for (int i4 = 0; i4 < arrau.length; ++i4) {
                Object object2 = av2.a((Object)arrau[i4], new bs());
                this.a(l2 + (long)(i4 * n2), object2, class_2);
            }
        } else {
            throw new IllegalArgumentException("Writing array of " + class_ + " to memory not supported");
        }
    }

    public void a(long l2, long l3, byte by2) {
        Native.setMemory(this.J + l2, l3, by2);
    }

    public void a(long l2, byte by2) {
        Native.setByte(this.J + l2, by2);
    }

    public void a(long l2, short s2) {
        Native.setShort(this.J + l2, s2);
    }

    public void a(long l2, char c2) {
        Native.setChar(this.J + l2, c2);
    }

    public void a(long l2, int n2) {
        Native.setInt(this.J + l2, n2);
    }

    public void d(long l2, long l3) {
        Native.setLong(this.J + l2, l3);
    }

    public void a(long l2, at at2) {
        if (at.a == 8) {
            this.d(l2, at2.longValue());
        } else {
            this.a(l2, at2.intValue());
        }
    }

    public void a(long l2, float f2) {
        Native.setFloat(this.J + l2, f2);
    }

    public void a(long l2, double d2) {
        Native.setDouble(this.J + l2, d2);
    }

    public void a(long l2, ay ay2) {
        Native.setPointer(this.J + l2, ay2 != null ? ay2.J : 0L);
    }

    public void a(long l2, String string, boolean bl2) {
        Native.setString(this.J + l2, string, bl2);
    }

    public void a(long l2, String string) {
        byte[] arrby = Native.a(string);
        this.b(l2, arrby, 0, arrby.length);
        this.a(l2 + (long)arrby.length, (byte)0);
    }

    public String toString() {
        return "native@0x" + Long.toHexString(this.J);
    }

    public static long b(ay ay2) {
        return ay2.J;
    }

    public static void a(ay ay2, long l2) {
        ay2.J = l2;
    }

    static Class b(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static {
        if (H == 0) {
            throw new Error("Native library not initialized");
        }
        I = null;
    }
}

