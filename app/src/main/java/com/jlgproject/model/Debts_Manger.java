package com.jlgproject.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sunbeibei on 2017/6/9.
 */

public class Debts_Manger implements Serializable {


    /**
     * state : ok
     * message :
     * data : {"pageNum":1,"total":2,"items":[{"id":10116,"createTime":"2017-07-12 ","from":"孙贝贝","to":"王锋","amout":6663333,"orderId":"ac58b809033743fab2e9d20dbf86cb1e","payStatus":1,"isSolution":0,"otherPerson":null,"qianshu":"0.01"},{"id":10115,"createTime":"2017-07-12 ","from":"孙贝贝","to":"王锋","amout":46555,"orderId":"f6316f8c1bf64646bde71d5505e7d9ff","payStatus":0,"isSolution":0,"otherPerson":null,"qianshu":"0.01"}]}
     */

    private String state;
    private String message;
    /**
     * pageNum : 1
     * total : 2
     * items : [{"id":10116,"createTime":"2017-07-12 ","from":"孙贝贝","to":"王锋","amout":6663333,"orderId":"ac58b809033743fab2e9d20dbf86cb1e","payStatus":1,"isSolution":0,"otherPerson":null,"qianshu":"0.01"},{"id":10115,"createTime":"2017-07-12 ","from":"孙贝贝","to":"王锋","amout":46555,"orderId":"f6316f8c1bf64646bde71d5505e7d9ff","payStatus":0,"isSolution":0,"otherPerson":null,"qianshu":"0.01"}]
     */

    private DataBean data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int pageNum;
        private int total;
        /**
         * id : 10116
         * createTime : 2017-07-12
         * from : 孙贝贝
         * to : 王锋
         * amout : 6663333
         * orderId : ac58b809033743fab2e9d20dbf86cb1e
         * payStatus : 1
         * isSolution : 0
         * otherPerson : null
         * qianshu : 0.01
         */

        private List<ItemsBean> items;

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            private Long id;
            private String createTime;
            private String from;
            private String to;
            private Long amout;
            private String orderId;
            private int payStatus;
            private int isSolution;
            private Object otherPerson;
            private String qianshu;

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {
                this.from = from;
            }

            public String getTo() {
                return to;
            }

            public void setTo(String to) {
                this.to = to;
            }

            public Long getAmout() {
                return amout;
            }

            public void setAmout(Long amout) {
                this.amout = amout;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public int getPayStatus() {
                return payStatus;
            }

            public void setPayStatus(int payStatus) {
                this.payStatus = payStatus;
            }

            public int getIsSolution() {
                return isSolution;
            }

            public void setIsSolution(int isSolution) {
                this.isSolution = isSolution;
            }

            public Object getOtherPerson() {
                return otherPerson;
            }

            public void setOtherPerson(Object otherPerson) {
                this.otherPerson = otherPerson;
            }

            public String getQianshu() {
                return qianshu;
            }

            public void setQianshu(String qianshu) {
                this.qianshu = qianshu;
            }
        }
    }
}
