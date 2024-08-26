/*
 * Copyright 2021 Dmytro Ponomarenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.com.finallite.audio

import java.lang.Exception

/**
 * Created on 03.02.2021.
 * @author Dimowner
 */
interface AudioDecodingListener {
	fun isCanceled(): Boolean
	fun onStartProcessing(duration: Long, channelsCount: Int, sampleRate: Int)
	fun onProcessingProgress(percent: Int)
	fun onProcessingCancel()
	fun onFinishProcessing(data: IntArray, duration: Long)
	fun onError(exception: Exception)
}
