/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.api.service;

import org.apache.dolphinscheduler.api.dto.AuditDto;
import org.apache.dolphinscheduler.api.utils.PageInfo;
import org.apache.dolphinscheduler.dao.entity.AuditLog;

import java.util.List;

/**
 * audit information service
 */
public interface AuditService {

    /**
     * add audit object
     *
     * @param auditLog         auditLog
     */
    void addAudit(AuditLog auditLog);

    /**
     * add audit by list
     *
     * @param auditLogList         auditLog list
     * @param latency             api latency milliseconds
     */
    void addAudit(List<AuditLog> auditLogList, long latency);

    /**
     * query audit log list
     *
     * @param modelTypes          model types
     * @param modelName           model name
     * @param operationTypes      operation types
     * @param startTime           start time
     * @param endTime             end time
     * @param userName            query user name
     * @param pageNo              page number
     * @param pageSize            page size
     * @return                    audit log string
     */
    PageInfo<AuditDto> queryLogListPaging(String modelTypes,
                                          String operationTypes, String startTime,
                                          String endTime, String userName, String modelName,
                                          Integer pageNo, Integer pageSize);

}
