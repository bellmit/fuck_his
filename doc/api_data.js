define({ "api": [
  {
    "type": "get",
    "url": "/find/apartment",
    "title": "搜索部门",
    "group": "Apartment",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>科室id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    ?id=11\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 11,\n    \"apartmentName\": \"急诊\",\n    \"introduction\": \"这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看\",\n    \"apartmentId\": 1\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/FindOneController.java",
    "groupTitle": "科室",
    "name": "GetFindApartment"
  },
  {
    "type": "get",
    "url": "/list/apartment",
    "title": "获取所有科室",
    "group": "Apartment",
    "success": {
      "examples": [
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 11,\n    \"apartmentName\": \"急诊\",\n    \"introduction\": \"这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看\",\n    \"apartmentId\": 1\n    },\n    {\n    \"id\": 12,\n    \"apartmentName\": \"妇产科\",\n    \"introduction\": \"这里是妇产科，每天都有很多小新生命在这里诞生\",\n    \"apartmentId\": 2\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/GetListController.java",
    "groupTitle": "科室",
    "name": "GetListApartment"
  },
  {
    "type": "post",
    "url": "/add/apartment",
    "title": "添加科室",
    "group": "Apartment",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>科室名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "introduction",
            "description": "<p>科室简介</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "apartmentId",
            "description": "<p>科室代号[大类.小类]</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    name:急诊\n    introduction:这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看\n    apartmentId:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 11,\n    \"apartmentName\": \"急诊\",\n    \"introduction\": \"这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看\",\n    \"apartmentId\": 1\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/AddController.java",
    "groupTitle": "科室",
    "name": "PostAddApartment"
  },
  {
    "type": "post",
    "url": "/delete/apartment",
    "title": "删除科室",
    "group": "Apartment",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "apartmentId",
            "description": "<p>科室id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:{",
          "content": "    apartmentId:12\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/DeleteController.java",
    "groupTitle": "科室",
    "name": "PostDeleteApartment"
  },
  {
    "type": "post",
    "url": "/update/apartment",
    "title": "修改科室信息",
    "group": "Apartment",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>科室id【不可为空】</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>科室名称[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "introduction",
            "description": "<p>科室简介[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "apartmentId",
            "description": "<p>科室代号[可空][大类.小类]</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    introduction:这里是妇产科，每天都有很多小新生命在这里诞生\n    id:12\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 12,\n    \"apartmentName\": \"妇产科\",\n    \"introduction\": \"这里是妇产科，每天都有很多小新生命在这里诞生\",\n    \"apartmentId\": 2\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/UpdateController.java",
    "groupTitle": "科室",
    "name": "PostUpdateApartment"
  },
  {
    "type": "get",
    "url": "/find/doctor",
    "title": "搜索医生",
    "group": "Doctor",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>医生id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    ?id=4\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 4,\n    \"name\": \"李小豪\",\n    \"phonenumber\": \"18320444511\",\n    \"password\": \"abc1234\",\n    \"level\": \"实习医师\",\n    \"introduction\": \"我叫李小豪，是个医生，我爱治病救人\",\n    \"workKind\": 2,\n    \"apartmentId\": 1,\n    \"monthPeople\": 0,\n    \"man\": true\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/FindOneController.java",
    "groupTitle": "医生",
    "name": "GetFindDoctor"
  },
  {
    "type": "get",
    "url": "/list/doctor",
    "title": "获取所有医生",
    "group": "Doctor",
    "success": {
      "examples": [
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    [\n    4,\n    \"李小豪\",\n    \"18320444515\",\n    true,\n    \"实习医师\",\n    \"急诊\",\n    \"我叫李小豪，是个医生，我爱治病救人\",\n    2,\n    0\n    ],\n    [\n    5,\n    \"李大豪\",\n    \"18320444515\",\n    true,\n    \"主任医师\",\n    \"急诊\",\n    \"我叫李大豪，治病救人是我的天职\",\n    2,\n    0\n    ],\n    [\n    10,\n    \"李疯\",\n    \"18320444555\",\n    true,\n    \"退休医师\",\n    \"妇产科\",\n    \"我是另一个部门的FFF\",\n    1,\n    0\n    ]\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/GetListController.java",
    "groupTitle": "医生",
    "name": "GetListDoctor"
  },
  {
    "type": "post",
    "url": "/add/doctor",
    "title": "添加医生",
    "group": "Doctor",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>医生姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "sex",
            "description": "<p>医生性别（若bool类型传输有问题可以改）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "appartmentId",
            "description": "<p>科室代号[大类.小类]</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "workKind",
            "description": "<p>值班类型（上什么班）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "introduction",
            "description": "<p>医生简介</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "level",
            "description": "<p>医生职称</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    name:李小豪\n    sex:true\n    password:1234\n    phonenumber:18320444515\n    //id:2\n    apartmentId:1\n    workKind:1\n    introduction:我叫李大豪，是个医生，我爱治病救人\n    level:实习医师\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 4,\n    \"name\": \"李小豪\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"1234\",\n    \"level\": \"实习医师\",\n    \"introduction\": \"我叫李大豪，是个医生，我爱治病救人\",\n    \"workKind\": 1,\n    \"apartmentId\": 1,\n    \"monthPeople\": 0,\n    \"man\": true\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/AddController.java",
    "groupTitle": "医生",
    "name": "PostAddDoctor"
  },
  {
    "type": "post",
    "url": "/delete/doctor",
    "title": "删除医生",
    "group": "Doctor",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "doctorId",
            "description": "<p>医生id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:{",
          "content": "    doctorId:10\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/DeleteController.java",
    "groupTitle": "医生",
    "name": "PostDeleteDoctor"
  },
  {
    "type": "post",
    "url": "/login/doctor",
    "title": "医生登录",
    "group": "Doctor",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    password:abc1234\n    phonenumber:18320444511\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 4,\n    \"name\": \"李小豪\",\n    \"phonenumber\": \"18320444511\",\n    \"password\": \"abc1234\",\n    \"level\": \"实习医师\",\n    \"introduction\": \"我叫李小豪，是个医生，我爱治病救人\",\n    \"workKind\": 2,\n    \"apartmentId\": 1,\n    \"monthPeople\": 0,\n    \"man\": true\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/LoginController.java",
    "groupTitle": "医生",
    "name": "PostLoginDoctor"
  },
  {
    "type": "post",
    "url": "/update/doctor",
    "title": "修改医生信息",
    "group": "Doctor",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>医生id【不可为空】</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>医生姓名[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "sex",
            "description": "<p>医生性别（若bool类型传输有问题可以改）【最好不要空，默认true=男】</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "appartmentId",
            "description": "<p>科室代号[可空][大类.小类]</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "workKind",
            "description": "<p>值班类型（上什么班）[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "introduction",
            "description": "<p>医生简介[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "level",
            "description": "<p>医生职称[可空]</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:4\n    introduction:我叫李小豪，是个医生，我爱治病救人\n    level:实习医师\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 4,\n    \"name\": \"李小豪\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"abc1234\",\n    \"level\": \"实习医师\",\n    \"introduction\": \"我叫李小豪，是个医生，我爱治病救人\",\n    \"workKind\": 2,\n    \"apartmentId\": 1,\n    \"monthPeople\": 0,\n    \"man\": true\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/UpdateController.java",
    "groupTitle": "医生",
    "name": "PostUpdateDoctor"
  },
  {
    "type": "get",
    "url": "/find/history",
    "title": "搜索就诊记录",
    "group": "History",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>病历id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    ?id=13\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 13,\n    \"patientId\": 2,\n    \"doctorId\": 10,\n    \"judge\": \"急性肠胃炎\",\n    \"mainTold\": \"肚子不舒服，头晕想呕，很难受\",\n    \"medicines\": \"藿香正气液、阿莫西林胶囊\",\n    \"price\": 20,\n    \"createTime\": 1540045791968,\n    \"paid\": false\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/FindOneController.java",
    "groupTitle": "病历（就诊历史）",
    "name": "GetFindHistory"
  },
  {
    "type": "get",
    "url": "/list/history",
    "title": "获取所有就诊历史（病历）",
    "group": "History",
    "success": {
      "examples": [
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    [\n    13,\n    \"王小凤\",\n    10,\n    \"急性肠胃炎\",\n    \"肚子不舒服，头晕想呕，很难受\",\n    \"藿香正气液、阿莫西林胶囊\",\n    0,\n    20\n    ],\n    [\n    14,\n    \"王小明\",\n    4,\n    \"运动造成的乳酸堆积\",\n    \"运动后的第二天全身酸痛，动弹不得\",\n    \"水杨酸甲酯软膏\",\n    0,\n    15\n    ]\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/GetListController.java",
    "groupTitle": "病历（就诊历史）",
    "name": "GetListHistory"
  },
  {
    "type": "post",
    "url": "/add/history",
    "title": "添加就诊历史（病历）",
    "group": "History",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "patientId",
            "description": "<p>病人id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "doctorId",
            "description": "<p>医生id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "judge",
            "description": "<p>主症（医生判断）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "mainTold",
            "description": "<p>主诉（患者自己说哪里不舒服）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "medicines",
            "description": "<p>药物清单</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "price",
            "description": "<p>药价</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    patientId:2\n    doctorId:10\n    judge:急性肠胃炎\n    mainTold:肚子不舒服，头晕想呕，很难受\n    medicines:藿香正气液、阿莫西林胶囊\n    price:20.0\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 13,\n    \"patientId\": 2,\n    \"doctorId\": 10,\n    \"judge\": \"急性肠胃炎\",\n    \"mainTold\": \"肚子不舒服，头晕想呕，很难受\",\n    \"medicines\": \"藿香正气液、阿莫西林胶囊\",\n    \"price\": 20,\n    \"isPaid\": 0,\n    \"createTime\": 1540045791968\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/AddController.java",
    "groupTitle": "病历（就诊历史）",
    "name": "PostAddHistory"
  },
  {
    "type": "post",
    "url": "/add/history",
    "title": "修改就诊历史（病历）",
    "group": "History",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>病历id【不可为空】</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "patientId",
            "description": "<p>病人id[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "doctorId",
            "description": "<p>医生id[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "judge",
            "description": "<p>主症（医生判断）[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "mainTold",
            "description": "<p>主诉（患者自己说哪里不舒服）[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "medicines",
            "description": "<p>药物清单[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "price",
            "description": "<p>药价[可空]</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    mainTold:运动后的第二天全身酸痛，动弹不得\n    id:14\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 14,\n    \"patientId\": 3,\n    \"doctorId\": 4,\n    \"judge\": \"运动造成的乳酸堆积\",\n    \"mainTold\": \"运动后的第二天全身酸痛，动弹不得\",\n    \"medicines\": \"水杨酸甲酯软膏\",\n    \"price\": 15,\n    \"isPaid\": 0,\n    \"createTime\": 1540045916590\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/UpdateController.java",
    "groupTitle": "病历（就诊历史）",
    "name": "PostAddHistory"
  },
  {
    "type": "post",
    "url": "/delete/history",
    "title": "删除就诊历史（病历）",
    "group": "History",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "historyId",
            "description": "<p>病历id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:{",
          "content": "    historyId:14\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/DeleteController.java",
    "groupTitle": "病历（就诊历史）",
    "name": "PostDeleteHistory"
  },
  {
    "type": "get",
    "url": "/find/patient",
    "title": "搜索病人",
    "group": "Patient",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>病人id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    ?id=3\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 3,\n    \"name\": \"王小明\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"1234\",\n    \"birthday\": 1234567890,\n    \"height\": 188,\n    \"weight\": 68,\n    \"address\": null,\n    \"healthCardId\": \"7382649975\",\n    \"peopleCard\": \"441781199700000000\",\n    \"allergy\": null,\n    \"cureTimes\": 0,\n    \"man\": true\n    },\n    \"ageString\": \"9岁9月\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "ageString",
            "description": "<p>描述年龄的文字</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/FindOneController.java",
    "groupTitle": "病人",
    "name": "GetFindPatient"
  },
  {
    "type": "get",
    "url": "/list/patient",
    "title": "获取所有病人 TODO 改示例",
    "group": "Patient",
    "success": {
      "examples": [
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    [\n    3,\n    1234567890,\n    \"王小明\",\n    \"18320444515\",\n    true,\n    188,\n    68,\n    \"7382649975\",\n    \"441781199700000000\",\n    0\n    ],\n    [\n    2,\n    1234567890,\n    \"王小凤\",\n    \"18320444515\",\n    true,\n    188,\n    68,\n    \"7382649975\",\n    \"441781199700000000\",\n    0\n    ]\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/GetListController.java",
    "groupTitle": "病人",
    "name": "GetListPatient"
  },
  {
    "type": "post",
    "url": "/add/patient",
    "title": "添加病人",
    "group": "Patient",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>病人姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "sex",
            "description": "<p>病人性别（若bool类型传输有问题可以改）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "peopleCard",
            "description": "<p>身份证号（可以考虑用这个来自动生成生日信息）</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "healthCardId",
            "description": "<p>诊疗卡号</p>"
          },
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "birthday",
            "description": "<p>生日时间戳（10位）</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "height",
            "description": "<p>身高</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "weight",
            "description": "<p>体重</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "address",
            "description": "<p>病人住址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "allergy",
            "description": "<p>过敏药物</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 15,\n    \"name\": \"王小明\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"1234\",\n    \"birthday\": 1234567890,\n    \"height\": 188,\n    \"weight\": 68,\n    \"address\": \"广州中医药大学三元里校区宿舍0栋-404\",\n    \"healthCardId\": \"7382649975\",\n    \"peopleCard\": \"441781199700000000\",\n    \"allergy\": \"酒精、海鲜\",\n    \"cureTimes\": 0,\n    \"man\": true\n    }\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 3,\n    \"name\": \"王小明\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"1234\",\n    \"birthday\": 1234567890,\n    \"height\": 188,\n    \"weight\": 68,\n    \"healthCardId\": \"7382649975\",\n    \"peopleCard\": \"441781199700000000\",\n    \"cureTimes\": 0,\n    \"man\": true\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/AddController.java",
    "groupTitle": "病人",
    "name": "PostAddPatient"
  },
  {
    "type": "post",
    "url": "/delete/patient",
    "title": "删除病人",
    "group": "Patient",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "patientId",
            "description": "<p>病人id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:{",
          "content": "    patientId:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:{",
          "content": "    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/DeleteController.java",
    "groupTitle": "病人",
    "name": "PostDeletePatient"
  },
  {
    "type": "post",
    "url": "/login/patient",
    "title": "病人登录",
    "group": "Patient",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    password:1234\n    phonenumber:18320444515\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 3,\n    \"name\": \"王小明\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"1234\",\n    \"birthday\": 1234567890,\n    \"height\": 188,\n    \"weight\": 68,\n    \"address\": null,\n    \"healthCardId\": \"7382649975\",\n    \"peopleCard\": \"441781199700000000\",\n    \"allergy\": null,\n    \"cureTimes\": 0,\n    \"man\": true\n    },\n    \"ageString\": \"9岁9月\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "ageString",
            "description": "<p>描述年龄的文字</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/LoginController.java",
    "groupTitle": "病人",
    "name": "PostLoginPatient"
  },
  {
    "type": "post",
    "url": "/update/patient",
    "title": "修改病人信息",
    "group": "Patient",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>病人id【不可为空】</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>病人姓名[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "sex",
            "description": "<p>病人性别（若bool类型传输有问题可以改）【最好不要空，默认true=男】</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "peopleCard",
            "description": "<p>身份证号（可以考虑用这个来自动生成生日信息）[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "healthCardId",
            "description": "<p>诊疗卡号[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "birthday",
            "description": "<p>生日时间戳[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "height",
            "description": "<p>身高[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "double",
            "optional": false,
            "field": "weight",
            "description": "<p>体重[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "address",
            "description": "<p>病人住址[可空]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "allergy",
            "description": "<p>过敏药物[可空]</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    sex:false\n    id:15\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 15,\n    \"name\": \"王小红\",\n    \"phonenumber\": \"18320444515\",\n    \"password\": \"1234\",\n    \"birthday\": 1234567890,\n    \"height\": 188,\n    \"weight\": 68,\n    \"address\": \"广州中医药大学三元里校区宿舍0栋-404\",\n    \"healthCardId\": \"7382649975\",\n    \"peopleCard\": \"441781199700000000\",\n    \"allergy\": \"酒精、海鲜\",\n    \"cureTimes\": 0,\n    \"man\": false\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/UpdateController.java",
    "groupTitle": "病人",
    "name": "PostUpdatePatient"
  },
  {
    "type": "get",
    "url": "/queue/add",
    "title": "挂号落实",
    "group": "Websocket",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "patientId",
            "description": "<p>病人id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "doctorId",
            "description": "<p>医生id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    /his/queue/add?patientId=3&doctorId=8\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\":200,\"resultMsg\":\"成功\",\"data\":null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/QueueController.java",
    "groupTitle": "通信",
    "name": "GetQueueAdd"
  },
  {
    "type": "get",
    "url": "/queue/call",
    "title": "叫下一个病人到医生处就诊",
    "group": "Websocket",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "doctorId",
            "description": "<p>医生id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    /his/queue/call?doctorId=8\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\":200,\"resultMsg\":\"成功\",\"data\":{\"id\":3,\"name\":\"王小明\",\"phonenumber\":\"18320444515\",\"password\":\"1234\",\"birthday\":1234567890,\"height\":188.0,\"weight\":68.0,\"address\":null,\"healthCardId\":\"7382649975\",\"peopleCard\":\"441781199700000000\",\"allergy\":null,\"cureTimes\":0,\"man\":true}\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/QueueController.java",
    "groupTitle": "通信",
    "name": "GetQueueCall"
  },
  {
    "type": "get",
    "url": "/queue/get",
    "title": "获取对应医生的排队列表",
    "group": "Websocket",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "doctorId",
            "description": "<p>医生id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    /his/queue/get?doctorId=8\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\":200,\"resultMsg\":\"成功\",\"data\":[\"1\",\"2\",\"3\"]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./com/gzucm/fuck_his/controller/QueueController.java",
    "groupTitle": "通信",
    "name": "GetQueueGet"
  }
] });
