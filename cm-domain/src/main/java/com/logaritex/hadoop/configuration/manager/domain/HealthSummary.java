/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.logaritex.hadoop.configuration.manager.domain;

/**
 * Represents of the high-level health status of a subject in the cluster.
 * 
 */
public enum HealthSummary {
	/**
	 * The health check for this subject has been disabled
	 */
	DISABLED,
	/**
	 * The health status was not captured at this past instant
	 */
	HISTORY_NOT_AVAILABLE,
	/**
	 * The health status cannot be determined
	 */
	NOT_AVAILABLE,
	/**
	 * The subject is in good health
	 */
	GOOD,
	/**
	 * The subject is in concerning health
	 */
	CONCERNING,
	/**
	 * The subject is in bad health
	 */
	BAD;
}