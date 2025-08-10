import { useState, useEffect } from "react";
import "./CohortDetails-modules.css";
function CohortDetails(props) {
    const {currentStatus} = props.cohort;
    const h3color = currentStatus==='Ongoing'?'green':'blue';
    console.log(h3color);
    return (
        <div className="box">
            <h3 style={{color: h3color}}>
                {props.cohort.cohortCode} -
                <span>{props.cohort.technology}</span>
            </h3>
            
            <dl>
                <dt>Started On</dt>
                <dd>{props.cohort.startDate}</dd>
                <dt>Current Status</dt>
                <dd>{props.cohort.currentStatus}</dd>
                <dt>Coach</dt>
                <dd>{props.cohort.coachName}</dd>
                <dt>Trainer</dt>
                <dd>{props.cohort.trainerName}</dd>
            </dl>
        </div>

        
    );
}
export default CohortDetails;