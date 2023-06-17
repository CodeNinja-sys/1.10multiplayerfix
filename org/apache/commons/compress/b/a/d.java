/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.a;

final class d {
    final boolean[] a = new boolean[256];
    final byte[] b = new byte[256];
    final int[] c = new int[258];
    final byte[] d = new byte[18002];
    final byte[] e = new byte[18002];
    final byte[] f = new byte[256];
    final byte[][] g = new byte[6][258];
    final int[][] h = new int[6][258];
    final int[] i = new int[6];
    final short[] j = new short[6];
    final int[][] k = new int[6][258];
    final byte[] l = new byte[6];
    final boolean[] m = new boolean[16];
    final int[] n = new int[260];
    final int[] o = new int[516];
    final int[] p = new int[516];
    final byte[] q;
    final int[] r;
    final char[] s;
    int t;

    d(int n2) {
        int n3 = n2 * 100000;
        this.q = new byte[n3 + 1 + 20];
        this.r = new int[n3];
        this.s = new char[2 * n3];
    }
}

