def call(Map config = [:]) {
    bat "echo Hello Shared_lib ${config.name}. Today is ${config.dayOfWeek}."
}
