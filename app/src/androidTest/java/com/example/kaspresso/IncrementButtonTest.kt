package com.example.kaspresso

import android.Manifest
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.rule.GrantPermissionRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class IncrementButtonTest : BaseTest() {

    @Test
    fun increaseButtonShouldIncreaseValueTest() = run {
        step("Increase counter value to 2") {
            MainScreen {
                repeat(2) {
                    incrementButton.click()
                }
            }
        }

        step("Counter value should be 2") {
            MainScreen {
                counterText.hasText("Count: 2")
            }
        }
    }
}