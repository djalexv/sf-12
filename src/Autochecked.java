interface Autochecked {
    default void checkAutomatically() {
        System.out.println("Задание выполнено");;
    }
   boolean isCheckAutomatically();
}
