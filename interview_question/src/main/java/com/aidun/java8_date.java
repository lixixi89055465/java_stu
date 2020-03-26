package com.aidun;

import java.time.*;

/**
 * @author lixiang
 * @date 2020-03-26-15:57
 */
public class java8_date {
    public static void main(String[] args) throws InterruptedException {
        test04();
    }

    /**
     * 计算时间间隔
     */
    public static void test04() {

        LocalDate past = LocalDate.of(2018, 8, 22);
        LocalDate now = LocalDate.of(2019, 5, 12);
        Period between = Period.between(past, now);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        System.out.println(now.getDayOfYear());

    }

    /**
     * 计算时间间隔
     *
     * @throws InterruptedException
     */
    public static void test03() throws InterruptedException {
        Instant instant1 = Instant.now();
        Thread.sleep(100);
        Instant instant2 = Instant.now();
        Duration between = Duration.between(instant1, instant2);
        System.out.println(between.toMillis());

        LocalTime now = LocalTime.now();
        Thread.sleep(1000);
        LocalTime now1 = LocalTime.now();
        System.out.println(Duration.between(now, now1).toMinutes());
    }

    /**
     * Instant :时间戳， 以unix元年
     */
    private static void instantTest01() {
        Instant instant = Instant.now();
        System.out.println(instant);
        OffsetDateTime odt = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(odt);
    }

    /**
     * LocalDate , LocalTime  LocalDateTime
     *
     * @param now
     */
    private static void java8_date01(LocalDateTime now) {
        System.out.println(now);
        LocalDateTime of = LocalDateTime.of(2019, 3, 23, 12, 23, 34);
        System.out.println(of);
        LocalDateTime localDateTime = of.plusYears(5);
        System.out.println(localDateTime);
        System.out.println(of.minusMonths(5));
        System.out.println(of.getDayOfMonth());
    }
}
