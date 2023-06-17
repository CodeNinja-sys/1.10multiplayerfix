/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.d;
import org.lwjgl.x;

final class y {
    private y() {
    }

    static int a(x x2, x x3, long l2, long l3) {
        if (!d.j) {
            return 0;
        }
        long l4 = x2.d(0);
        long l5 = x2.d(1);
        long l6 = x2.d(2);
        if (d.i && (l4 < 0L || l5 < 0L || l6 < 0L)) {
            throw new IllegalArgumentException("Invalid cl_mem host offset: " + l4 + ", " + l5 + ", " + l6);
        }
        long l7 = x3.d(0);
        long l8 = x3.d(1);
        long l9 = x3.d(2);
        if (d.i && (l7 < 1L || l8 < 1L || l9 < 1L)) {
            throw new IllegalArgumentException("Invalid cl_mem rectangle region dimensions: " + l7 + " x " + l8 + " x " + l9);
        }
        if (l2 == 0L) {
            l2 = l7;
        } else if (d.i && l2 < l7) {
            throw new IllegalArgumentException("Invalid host row pitch specified: " + l2);
        }
        if (l3 == 0L) {
            l3 = l2 * l8;
        } else if (d.i && l3 < l2 * l8) {
            throw new IllegalArgumentException("Invalid host slice pitch specified: " + l3);
        }
        return (int)(l6 * l3 + l5 * l2 + l4 + l7 * l8 * l9);
    }

    static int a(x x2, long l2, long l3) {
        if (!d.j) {
            return 0;
        }
        long l4 = x2.d(0);
        long l5 = x2.d(1);
        long l6 = x2.d(2);
        if (d.i && (l4 < 1L || l5 < 1L || l6 < 1L)) {
            throw new IllegalArgumentException("Invalid cl_mem image region dimensions: " + l4 + " x " + l5 + " x " + l6);
        }
        if (l2 == 0L) {
            l2 = l4;
        } else if (d.i && l2 < l4) {
            throw new IllegalArgumentException("Invalid row pitch specified: " + l2);
        }
        if (l3 == 0L) {
            l3 = l2 * l5;
        } else if (d.i && l3 < l2 * l5) {
            throw new IllegalArgumentException("Invalid slice pitch specified: " + l3);
        }
        return (int)(l3 * l6);
    }

    static int a(ByteBuffer byteBuffer, long l2, long l3, long l4) {
        if (!d.j) {
            return 0;
        }
        if (d.i && (l2 < 1L || l3 < 1L)) {
            throw new IllegalArgumentException("Invalid 2D image dimensions: " + l2 + " x " + l3);
        }
        int n2 = y.a(byteBuffer);
        if (l4 == 0L) {
            l4 = l2 * (long)n2;
        } else if (d.i && (l4 < l2 * (long)n2 || l4 % (long)n2 != 0L)) {
            throw new IllegalArgumentException("Invalid image_row_pitch specified: " + l4);
        }
        return (int)(l4 * l3);
    }

    static int a(ByteBuffer byteBuffer, long l2, long l3, long l4, long l5, long l6) {
        if (!d.j) {
            return 0;
        }
        if (d.i && (l2 < 1L || l3 < 1L || l4 < 2L)) {
            throw new IllegalArgumentException("Invalid 3D image dimensions: " + l2 + " x " + l3 + " x " + l4);
        }
        int n2 = y.a(byteBuffer);
        if (l5 == 0L) {
            l5 = l2 * (long)n2;
        } else if (d.i && (l5 < l2 * (long)n2 || l5 % (long)n2 != 0L)) {
            throw new IllegalArgumentException("Invalid image_row_pitch specified: " + l5);
        }
        if (l6 == 0L) {
            l6 = l5 * l3;
        } else if (d.i && (l5 < l5 * l3 || l6 % l5 != 0L)) {
            throw new IllegalArgumentException("Invalid image_slice_pitch specified: " + l5);
        }
        return (int)(l6 * l4);
    }

    private static int a(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.getInt(byteBuffer.position() + 0);
        int n3 = byteBuffer.getInt(byteBuffer.position() + 4);
        return y.a(n2) * y.b(n3);
    }

    private static int a(int n2) {
        switch (n2) {
            case 4272: 
            case 4273: 
            case 4280: 
            case 4281: 
            case 4282: {
                return 1;
            }
            case 4274: 
            case 4275: 
            case 4283: {
                return 2;
            }
            case 4276: 
            case 4284: {
                return 3;
            }
            case 4277: 
            case 4278: 
            case 4279: {
                return 4;
            }
        }
        throw new IllegalArgumentException("Invalid cl_channel_order specified: " + d.a(n2));
    }

    private static int b(int n2) {
        switch (n2) {
            case 4304: 
            case 4306: 
            case 4311: 
            case 4314: {
                return 1;
            }
            case 4305: 
            case 4307: 
            case 4308: 
            case 4309: 
            case 4312: 
            case 4315: 
            case 4317: {
                return 2;
            }
            case 4310: 
            case 4313: 
            case 4316: 
            case 4318: {
                return 4;
            }
        }
        throw new IllegalArgumentException("Invalid cl_channel_type specified: " + d.a(n2));
    }
}

