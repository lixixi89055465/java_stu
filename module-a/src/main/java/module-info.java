module module.a {
    exports com.test to module.b;
    opens com.test;
    requires transitive java.logging;

}