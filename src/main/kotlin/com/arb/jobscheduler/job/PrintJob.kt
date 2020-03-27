package com.arb.jobscheduler.job

class PrintJob(val message: String,  delay: Long) : Job(delay) {
    override fun executeJob() {
        println(message)
    }
}