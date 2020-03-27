package com.arb.jobscheduler.job

import java.sql.Timestamp
import java.util.*
import java.util.concurrent.TimeUnit

abstract class Job(val delay: Long, val startTime:Timer, val endTimeUnit: TimeUnit):Runnable {
    override fun run() {
        executeJob()
    }

    abstract fun executeJob()
}