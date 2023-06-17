/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.b;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.a.a.l;
import org.apache.commons.a.a.m;

public class c {
    private static final int a = 1024;

    private static byte[] b(MessageDigest messageDigest, InputStream inputStream) {
        return c.a(messageDigest, inputStream).digest();
    }

    public static MessageDigest a(String string) {
        try {
            return MessageDigest.getInstance(string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalArgumentException(noSuchAlgorithmException);
        }
    }

    public static MessageDigest a() {
        return c.a("MD2");
    }

    public static MessageDigest b() {
        return c.a("MD5");
    }

    public static MessageDigest c() {
        return c.a("SHA-1");
    }

    public static MessageDigest d() {
        return c.a("SHA-256");
    }

    public static MessageDigest e() {
        return c.a("SHA-384");
    }

    public static MessageDigest f() {
        return c.a("SHA-512");
    }

    public static MessageDigest g() {
        return c.c();
    }

    public static byte[] a(byte[] arrby) {
        return c.a().digest(arrby);
    }

    public static byte[] a(InputStream inputStream) {
        return c.b(c.a(), inputStream);
    }

    public static byte[] b(String string) {
        return c.a(m.f(string));
    }

    public static String b(byte[] arrby) {
        return l.d(c.a(arrby));
    }

    public static String b(InputStream inputStream) {
        return l.d(c.a(inputStream));
    }

    public static String c(String string) {
        return l.d(c.b(string));
    }

    public static byte[] c(byte[] arrby) {
        return c.b().digest(arrby);
    }

    public static byte[] c(InputStream inputStream) {
        return c.b(c.b(), inputStream);
    }

    public static byte[] d(String string) {
        return c.c(m.f(string));
    }

    public static String d(byte[] arrby) {
        return l.d(c.c(arrby));
    }

    public static String d(InputStream inputStream) {
        return l.d(c.c(inputStream));
    }

    public static String e(String string) {
        return l.d(c.d(string));
    }

    public static byte[] e(byte[] arrby) {
        return c.f(arrby);
    }

    public static byte[] e(InputStream inputStream) {
        return c.f(inputStream);
    }

    public static byte[] f(String string) {
        return c.g(string);
    }

    public static byte[] f(byte[] arrby) {
        return c.c().digest(arrby);
    }

    public static byte[] f(InputStream inputStream) {
        return c.b(c.c(), inputStream);
    }

    public static byte[] g(String string) {
        return c.f(m.f(string));
    }

    public static String g(byte[] arrby) {
        return l.d(c.f(arrby));
    }

    public static String g(InputStream inputStream) {
        return l.d(c.f(inputStream));
    }

    public static String h(String string) {
        return l.d(c.g(string));
    }

    public static byte[] h(byte[] arrby) {
        return c.d().digest(arrby);
    }

    public static byte[] h(InputStream inputStream) {
        return c.b(c.d(), inputStream);
    }

    public static byte[] i(String string) {
        return c.h(m.f(string));
    }

    public static String i(byte[] arrby) {
        return l.d(c.h(arrby));
    }

    public static String i(InputStream inputStream) {
        return l.d(c.h(inputStream));
    }

    public static String j(String string) {
        return l.d(c.i(string));
    }

    public static byte[] j(byte[] arrby) {
        return c.e().digest(arrby);
    }

    public static byte[] j(InputStream inputStream) {
        return c.b(c.e(), inputStream);
    }

    public static byte[] k(String string) {
        return c.j(m.f(string));
    }

    public static String k(byte[] arrby) {
        return l.d(c.j(arrby));
    }

    public static String k(InputStream inputStream) {
        return l.d(c.j(inputStream));
    }

    public static String l(String string) {
        return l.d(c.k(string));
    }

    public static byte[] l(byte[] arrby) {
        return c.f().digest(arrby);
    }

    public static byte[] l(InputStream inputStream) {
        return c.b(c.f(), inputStream);
    }

    public static byte[] m(String string) {
        return c.l(m.f(string));
    }

    public static String m(byte[] arrby) {
        return l.d(c.l(arrby));
    }

    public static String m(InputStream inputStream) {
        return l.d(c.l(inputStream));
    }

    public static String n(String string) {
        return l.d(c.m(string));
    }

    public static String n(byte[] arrby) {
        return c.g(arrby);
    }

    public static String n(InputStream inputStream) {
        return c.g(inputStream);
    }

    public static String o(String string) {
        return c.h(string);
    }

    public static MessageDigest a(MessageDigest messageDigest, byte[] arrby) {
        messageDigest.update(arrby);
        return messageDigest;
    }

    public static MessageDigest a(MessageDigest messageDigest, InputStream inputStream) {
        byte[] arrby = new byte[1024];
        int n2 = inputStream.read(arrby, 0, 1024);
        while (n2 > -1) {
            messageDigest.update(arrby, 0, n2);
            n2 = inputStream.read(arrby, 0, 1024);
        }
        return messageDigest;
    }

    public static MessageDigest a(MessageDigest messageDigest, String string) {
        messageDigest.update(m.f(string));
        return messageDigest;
    }
}

